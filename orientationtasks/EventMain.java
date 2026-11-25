
package orientationtasks;

public class EventMain {

    public static void main(String[] args) {

        EventList eventList = new EventList();

        eventList.addEvent(
                new Event(10.0, EventType.ARRIVAL)
        );

        eventList.addEvent(
                new Event(5.0, EventType.EXIT)
        );

        eventList.addEvent(
                new Event(15.0, EventType.ARRIVAL)
        );

        System.out.println("Events in chronological order:");

        eventList.printEvents();
    }
}
