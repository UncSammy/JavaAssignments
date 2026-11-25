
package orientationtasks;

public class SimulationTest {

    public static void main(String[] args) {

        EventList eventList = new EventList();
        Clock clock = Clock.getInstance();

        clock.setTime(0.0);

        ArrivalProcess arrivalProcess =
                new ArrivalProcess(EventType.ARRIVAL, 5.0);

        ServicePoint servicePoint = new ServicePoint();

        // Generate 10 arrival events
        for (int i = 0; i < 10; i++) {
            arrivalProcess.generateNextEvent(eventList, clock);
        }

        System.out.println("Final arrival time: " + clock.getTime());

        // Process all events without moving the clock
        while (!eventList.isEmpty()) {

            Event event = eventList.getNextEvent();

            if (event.getEventType() == EventType.ARRIVAL) {

                Customer customer = new Customer();
                customer.setStartTime(event.getEventTime());

                servicePoint.addToQueueue(customer);
            }
        }

        // Move clock forward by five time units
        clock.setTime(clock.getTime() + 5.0);

        System.out.println("\nClock after moving forward: "
                + clock.getTime());

        // Remove customers one at a time
        Customer customer;

        while ((customer = servicePoint.removeFromQueueue()) != null) {

            customer.setEndTime(clock.getTime());

            System.out.println("\nCustomer ID: " + customer.getId());

            System.out.println("Arrival time: "
                    + customer.getStartTime());

            System.out.println("Departure time: "
                    + customer.getEndTime());

            System.out.println("Time spent in system: "
                    + customer.getTimeSpent());
        }
    }
}
