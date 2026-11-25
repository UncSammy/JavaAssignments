
package orientationtasks;

public class ArrivalProcessTest {

    public static void main(String[] args) {

        EventList eventList = new EventList();

        Clock clock = Clock.getInstance();
        clock.setTime(0.0);

        ArrivalProcess arrivalProcess =
                new ArrivalProcess(EventType.ARRIVAL, 5.0);

        // Generate 10 arrival events
        for (int i = 0; i < 10; i++) {
            arrivalProcess.generateNextEvent(eventList, clock);
        }

        System.out.println("Final clock time: " + clock.getTime());

        System.out.println("\nGenerated arrival events:");
        eventList.printEvents();
    }
}
