
package orientationtasks;

public class OrientationTask1_5 {

    public static void main(String[] args) {

        ServicePoint servicePoint = new ServicePoint();

        CustomerGenerator generator = new CustomerGenerator();

        System.out.println("Generating customers...\n");

        generator.generateCustomers(servicePoint, 5);

        System.out.println("\nStarting service...\n");

        servicePoint.serve();

        System.out.println("\nAll customers have been served.");
    }
}
