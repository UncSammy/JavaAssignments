
package vehicleinterfaces;

public class Bus extends AbstractVehicle {

    private int capacity;

    public Bus(String fuel, int capacity) {
        super(fuel, "White", 25.0);
        this.capacity = capacity;
    }

    @Override
    public void start() {
        System.out.println("Bus is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Bus is stopping...");
    }

    @Override
    public String getInfo() {
        return "Bus Information:\n"
                + "Type: Bus\n"
                + "Fuel: " + getFuel() + "\n"
                + "Capacity: " + capacity + " passengers";
    }
}
