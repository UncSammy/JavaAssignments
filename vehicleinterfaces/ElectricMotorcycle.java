package vehicleinterfaces;

public class ElectricMotorcycle extends AbstractVehicle {

    public ElectricMotorcycle(String color) {
        super("Electricity", color, 8.0);
    }

    @Override
    public void start() {
        System.out.println("Electric motorcycle is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Electric motorcycle is stopping...");
    }

    @Override
    public void charge() {
        System.out.println("Electric motorcycle is charging...");
    }

    @Override
    public String getInfo() {
        return "Electric Motorcycle Information:\n"
                + "Type: Electric Motorcycle\n"
                + "Fuel: " + getFuel() + "\n"
                + "Color: " + getColor();
    }
}