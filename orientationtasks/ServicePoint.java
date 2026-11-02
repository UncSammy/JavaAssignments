
package orientationtasks;

import java.util.LinkedList;

public class ServicePoint {

    private LinkedList<Customer> queue;
    private long totalServiceTime;
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

    public void serve() {

        while (!queue.isEmpty()) {

            Customer customer = removeFromQueueue();

            long serviceStartTime = System.nanoTime();

            long serviceTime = (long) (Math.random() * 2000) + 1000;

            try {
                Thread.sleep(serviceTime);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Service was interrupted.");
                return;
            }

            long serviceEndTime = System.nanoTime();

            customer.setEndTime(serviceEndTime);

            long responseTime =
                    customer.getEndTime() - customer.getStartTime();

            long actualServiceTime =
                    serviceEndTime - serviceStartTime;

            totalServiceTime += actualServiceTime;
            customersServed++;

            System.out.println("\nCustomer ID: " + customer.getId());

            System.out.println("Response time: "
                    + responseTime / 1_000_000.0 + " ms");

            System.out.println("Service time: "
                    + actualServiceTime / 1_000_000.0 + " ms");
        }
    }

    public double getAverageServiceTime() {

        if (customersServed == 0) {
            return 0;
        }

        return (double) totalServiceTime / customersServed;
    }
}
