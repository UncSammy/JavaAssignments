
package orientationtasks;

import java.util.LinkedList;

public class ServicePoint {

    private LinkedList<Customer> queue;
    private double totalServiceTime;
    private int customersServed;

    public ServicePoint() {
        queue = new LinkedList<>();
        totalServiceTime = 0;
        customersServed = 0;
    }

    public void addToQueueue(Customer customer) {
        queue.addFirst(customer);
    }

    public Customer removeFromQueueue() {
        if (queue.isEmpty()) {
            return null;
        }

        return queue.removeLast();
    }

    // Serve customers using the simulation clock
    public void serve(Clock clock, double serviceTime) {

        while (!queue.isEmpty()) {

            Customer customer = removeFromQueueue();

            double serviceStartTime = clock.getTime();
            double serviceEndTime = serviceStartTime + serviceTime;

            clock.setTime(serviceEndTime);
            customer.setEndTime(serviceEndTime);

            double responseTime = customer.getTimeSpent();

            totalServiceTime += serviceTime;
            customersServed++;

            System.out.println("\nCustomer ID: " + customer.getId());
            System.out.println("Response time: " + responseTime);
            System.out.println("Service time: " + serviceTime);
        }
    }

    // Compatibility with older tests
    public void serve() {
        serve(Clock.getInstance(), 2.0);
    }

    public double getAverageServiceTime() {

        if (customersServed == 0) {
            return 0;
        }

        return totalServiceTime / customersServed;
    }
}
