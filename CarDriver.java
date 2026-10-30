
public class CarDriver {

    public static void main(String[] args) {

        Car car = new Car(60.0, 50);

        System.out.println("Current speed: " + car.getSpeed());

        car.setTargetSpeed(100);

        System.out.println("Target speed: " + car.getTargetSpeed());

        boolean activated = car.turnOnCruiseControl();

        if (activated) {
            System.out.println("Cruise control activated");
        } else {
            System.out.println("Cruise control could not be activated");
        }

        System.out.println("New speed: " + car.getSpeed());

        car.turnOffCruiseControl();

        System.out.println("Cruise control turned off");
    }
}
