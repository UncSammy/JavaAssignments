
package orientationtasks;

import eduni.distributions.Negexp;

public class ArrivalProcess {

    private EventType eventType;
    private Negexp generator;

    public ArrivalProcess(EventType eventType, double mean) {
        this.eventType = eventType;
        this.generator = new Negexp(mean);
    }

    public void generateNextEvent(EventList eventList, Clock clock) {

        double interval = generator.sample();

        double nextTime = clock.getTime() + interval;

        clock.setTime(nextTime);

        Event event = new Event(nextTime, eventType);

        eventList.addEvent(event);
    }
}
