
package vehicleinterfaces;

public class Motorcycle extends AbstractVehicle {

    public Motorcycle(String fuel, String color) {
        super(fuel, color, 4.5);
    }

    @Override
    public void start() {
        System.out.println("Motorcycle is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle is stopping...");
    }

    @Override
    public String getInfo() {
        return "Motorcycle Information:\n"
                + "Type: Motorcycle\n"
                + "Fuel: " + getFuel() + "\n"
                + "Color: " + getColor();
    }
}
