
public class ThreadSafeListMain {

    public static void main(String[] args) {

        ThreadSafeList list = new ThreadSafeList();

        // Create 5 threads
        Thread[] threads = new Thread[5];

        for (int i = 0; i < 5; i++) {

            final int threadNumber = i + 1;

            threads[i] = new Thread(() -> {

                // Each thread adds 100 elements
                for (int j = 1; j <= 100; j++) {
                    list.add("Thread " + threadNumber + " Item " + j);
                }

                System.out.println(
                        "Thread " + threadNumber + " finished."
                );
            });

            threads[i].start();
        }

        // Wait for all threads
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }

        System.out.println("Final list size: " + list.size());

        // Remove an element
        list.remove("Thread 1 Item 1");

        System.out.println("Size after removal: " + list.size());
    }
}
