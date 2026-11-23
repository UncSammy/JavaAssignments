
import java.util.Random;

public class ParallelSum {

    private final int[] numbers;
    private final int numberOfThreads;

    // Constructor
    public ParallelSum(int size) {

        if (size <= 0) {
            throw new IllegalArgumentException("Size must be positive");
        }

        numbers = new int[size];

        Random random = new Random();

        // Generate random numbers
        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(100);
        }

        // Get the number of available processor cores
        numberOfThreads = Runtime.getRuntime().availableProcessors();
    }

    // Calculate the sum using multiple threads
    public long calculateSum() {

        Thread[] threads = new Thread[numberOfThreads];
        long[] partialSums = new long[numberOfThreads];

        // Divide the array between threads
        for (int i = 0; i < numberOfThreads; i++) {

            final int threadIndex = i;

            int start = i * numbers.length / numberOfThreads;
            int end = (i + 1) * numbers.length / numberOfThreads;

            threads[i] = new Thread(() -> {

                long sum = 0;

                // Calculate this thread's portion
                for (int j = start; j < end; j++) {
                    sum += numbers[j];
                }

                partialSums[threadIndex] = sum;
            });

            threads[i].start();
        }

        // Wait for all threads to finish
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException("Calculation interrupted", e);
            }
        }

        // Combine partial sums
        long totalSum = 0;

        for (long sum : partialSums) {
            totalSum += sum;
        }

        return totalSum;
    }

    public int getNumberOfThreads() {
        return numberOfThreads;
    }
}
