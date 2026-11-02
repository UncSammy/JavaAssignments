public class BusTest {

    public static void main(String[] args) {

        Bus bus = new Bus(200, 50, 3);

        System.out.println("Bus passenger test");

        bus.passengerEnter();
        bus.passengerEnter();

        System.out.println("Passengers: " + bus.getPassengerCount());

        bus.passengerEnter();
        bus.passengerEnter();

        System.out.println("Passengers: " + bus.getPassengerCount());

        bus.passengerExit();

        System.out.println("Passengers after exit: " + bus.getPassengerCount());
    }
}