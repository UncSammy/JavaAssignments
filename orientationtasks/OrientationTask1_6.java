
package orientationtasks;

public class OrientationTask1_6 {

    public static void main(String[] args) {

        int numberOfRuns = 3;
        int numberOfCustomers = 5;

        for (int run = 1; run <= numberOfRuns; run++) {

            System.out.println("\n========================");
            System.out.println("Simulation run: " + run);
            System.out.println("========================");

            ServicePoint servicePoint = new ServicePoint();

            CustomerGenerator generator = new CustomerGenerator();

            generator.generateCustomers(servicePoint, numberOfCustomers);

            System.out.println("\nStarting service...\n");

            servicePoint.serve();

            System.out.println("\nAverage service time: "
                    + servicePoint.getAverageServiceTime() / 1_000_000.0
                    + " ms");

            System.out.println("Customers served: "
                    + numberOfCustomers);
        }

        System.out.println("\nAll simulations completed.");
    }
}
