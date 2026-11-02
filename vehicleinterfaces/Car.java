
package vehicleinterfaces;

public class Car extends AbstractVehicle {

    public Car(String fuel, String color) {
        super(fuel, color, 7.5);
    }

    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping...");
    }

    @Override
    public String getInfo() {
        return "Car Information:\n"
                + "Type: Car\n"
                + "Fuel: " + getFuel() + "\n"
                + "Color: " + getColor();
    }
}
