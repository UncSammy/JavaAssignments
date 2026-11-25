
import java.util.PriorityQueue;

public class EventList {

    private PriorityQueue<Event> events;

    public EventList() {
        events = new PriorityQueue<>();
    }

    // Add a new event to the list
    public void addEvent(Event event) {
        events.add(event);
    }

    // Get and remove the next event
    public Event getNextEvent() {
        return events.poll();
    }

    // Check if the event list is empty
    public boolean isEmpty() {
        return events.isEmpty();
    }

    // Print events in chronological order
    public void printEvents() {

        PriorityQueue<Event> copy = new PriorityQueue<>(events);

        while (!copy.isEmpty()) {
            System.out.println(copy.poll());
        }
    }
}
