
public class EventMain {

    public static void main(String[] args) {

        // Create an event list
        EventList eventList = new EventList();

        // Add events in different time order
        eventList.addEvent(new Event(5.0, EventType.ARRIVAL));
        eventList.addEvent(new Event(2.0, EventType.EXIT));
        eventList.addEvent(new Event(8.0, EventType.ARRIVAL));
        eventList.addEvent(new Event(1.0, EventType.EXIT));
        eventList.addEvent(new Event(4.0, EventType.ARRIVAL));

        // Print all events in chronological order
        System.out.println("Events in chronological order:");
        eventList.printEvents();

        // Remove and print the next event
        System.out.println("\nNext event to be processed:");
        Event nextEvent = eventList.getNextEvent();
        System.out.println(nextEvent);

        // Print remaining events
        System.out.println("\nRemaining events:");
        eventList.printEvents();
    }
}
