
package orientationtasks;

public class OrientationTask1_3 {

    public static void main(String[] args) {

        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        Customer customer3 = new Customer();

        customer1.setStartTime(1000);
        customer1.setEndTime(5000);

        customer2.setStartTime(2000);
        customer2.setEndTime(8000);

        customer3.setStartTime(3000);
        customer3.setEndTime(9000);

        System.out.println("Customer ID: " + customer1.getId());
        System.out.println("Time spent: " + customer1.getTimeSpent());

        System.out.println();

        System.out.println("Customer ID: " + customer2.getId());
        System.out.println("Time spent: " + customer2.getTimeSpent());

        System.out.println();

        System.out.println("Customer ID: " + customer3.getId());
        System.out.println("Time spent: " + customer3.getTimeSpent());
    }
}
