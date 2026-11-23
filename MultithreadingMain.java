public class MultithreadingMain {
    public static void main(String[] args) {

        OddEvenPrinter printer = new OddEvenPrinter(20);

        printer.start();
    }
}