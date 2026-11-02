
package orientationtasks;

import java.util.LinkedList;
import java.util.Scanner;

public class OrientationTask1_4 {

    public static void main(String[] args) {

        LinkedList<Customer> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        System.out.println("Customer Queue System");

        while (running) {

            System.out.println("\n1. Add customer to queue");
            System.out.println("2. Remove customer from queue");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    Customer customer = new Customer();
                    customer.setStartTime(System.nanoTime());

                    queue.addFirst(customer);

                    System.out.println("Customer "
                            + customer.getId() + " added to queue.");
                    break;

                case 2:
                    if (!queue.isEmpty()) {

                        Customer removedCustomer = queue.removeLast();
                        removedCustomer.setEndTime(System.nanoTime());

                        long timeSpent = removedCustomer.getTimeSpent();

                        System.out.println("Customer "
                                + removedCustomer.getId()
                                + " removed from queue.");

                        System.out.println("Time spent in queue: "
                                + timeSpent / 1_000_000_000.0
                                + " seconds");

                    } else {
                        System.out.println("Queue is empty.");
                    }
                    break;

                case 3:
                    running = false;
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        scanner.close();
    }
}