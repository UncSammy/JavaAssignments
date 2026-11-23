public class TicketReservationMain {

    public static void main(String[] args) {

        // Theater has 15 available seats
        TicketReservation theater = new TicketReservation(15);

        // Create 15 customer threads
        Thread[] customers = new Thread[15];

        for (int i = 0; i < customers.length; i++) {

            final int customerId = i + 1;

            // Each customer requests between 1 and 4 tickets
            final int tickets = (int) (Math.random() * 4) + 1;

            customers[i] = new Thread(() ->
                    theater.reserveTickets(customerId, tickets)
            );

            customers[i].start();
        }

        // Wait for all customers to finish
        for (Thread customer : customers) {
            try {
                customer.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }

        System.out.println("Ticket reservation process complete.");
    }
}