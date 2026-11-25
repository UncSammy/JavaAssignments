
package orientationtasks;

import java.util.PriorityQueue;

public class EventList {

    private PriorityQueue<Event> events;

    public EventList() {
        events = new PriorityQueue<>();
    }

    public void addEvent(Event event) {
        events.add(event);
    }

    public Event getNextEvent() {
        return events.poll();
    }

    public boolean isEmpty() {
        return events.isEmpty();
    }

    public void printEvents() {
        PriorityQueue<Event> copy = new PriorityQueue<>(events);

        while (!copy.isEmpty()) {
            System.out.println(copy.poll());
        }
    }
}
