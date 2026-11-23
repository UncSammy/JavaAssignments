
public class ParallelSumMain {

    public static void main(String[] args) {

        ParallelSum calculator = new ParallelSum(100000);

        System.out.println("Number of threads: "
                + calculator.getNumberOfThreads());

        long result = calculator.calculateSum();

        System.out.println("Total sum: " + result);

        System.out.println("Calculation complete.");
    }
}
