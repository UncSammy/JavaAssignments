
package orientationtasks;

public class ClockTest {

    public static void main(String[] args) {

        Clock clock1 = Clock.getInstance();

        System.out.println("Initial time: " + clock1.getTime());

        clock1.setTime(10.5);

        System.out.println("Updated time: " + clock1.getTime());

        Clock clock2 = Clock.getInstance();

        System.out.println("Same Clock instance: "
                + (clock1 == clock2));
    }
}
