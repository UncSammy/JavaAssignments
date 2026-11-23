public class OddEvenPrinter {

    private final int maxNumber;
    private int current = 1;

    public OddEvenPrinter(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    private synchronized void printNumbers(boolean odd) {
        while (current <= maxNumber) {
            try {
                while (current <= maxNumber &&
                        (current % 2 != 1) != odd) {
                    wait();
                }

                if (current <= maxNumber) {
                    System.out.println(
                            (odd ? "Odd Thread: " : "Even Thread: ") + current
                    );

                    current++;
                    notifyAll();
                }

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    public void start() {
        Thread oddThread = new Thread(() -> printNumbers(true));
        Thread evenThread = new Thread(() -> printNumbers(false));

        oddThread.start();
        evenThread.start();
    }
}