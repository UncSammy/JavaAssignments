package vehicleinterfaces;

public class ElectricCar extends AbstractVehicle {

    public ElectricCar(String color) {
        super("Electricity", color, 18.0);
    }

    @Override
    public void start() {
        System.out.println("Electric car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Electric car is stopping...");
    }

    @Override
    public void charge() {
        System.out.println("Electric car is charging...");
    }

    @Override
    public String getInfo() {
        return "Electric Car Information:\n"
                + "Type: Electric Car\n"
                + "Fuel: " + getFuel() + "\n"
                + "Color: " + getColor();
    }
}