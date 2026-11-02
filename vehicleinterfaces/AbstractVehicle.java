
package vehicleinterfaces;

public abstract class AbstractVehicle implements Vehicle, ElectricVehicle {

    private String fuel;
    private String color;
    private double fuelEfficiency;

    public AbstractVehicle(String fuel, String color, double fuelEfficiency) {
        this.fuel = fuel;
        this.color = color;
        this.fuelEfficiency = fuelEfficiency;
    }

    public String getFuel() {
        return fuel;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void charge() {
        System.out.println("Not possible to charge this vehicle.");
    }

    @Override
    public double calculateFuelEfficiency() {
        return fuelEfficiency;
    }

    @Override
    public abstract void start();

    @Override
    public abstract void stop();

    @Override
    public abstract String getInfo();
}
