package vehicleinterfaces;

public class VehicleDemo {

    public static void main(String[] args) {

        Car car = new Car("Petrol", "Red");
        Motorcycle motorcycle = new Motorcycle("Gasoline", "Black");
        Bus bus = new Bus("Diesel", 40);
        ElectricCar electricCar = new ElectricCar("White");
        ElectricMotorcycle electricMotorcycle = new ElectricMotorcycle("Blue");

        System.out.println("Vehicle Demonstration\n");

        car.start();
        car.stop();
        System.out.println(car.getInfo());
        System.out.println("Fuel efficiency: "
                + car.calculateFuelEfficiency() + " L/100 km");
        car.charge();
        System.out.println();

        motorcycle.start();
        motorcycle.stop();
        System.out.println(motorcycle.getInfo());
        System.out.println("Fuel efficiency: "
                + motorcycle.calculateFuelEfficiency() + " L/100 km");
        motorcycle.charge();
        System.out.println();

        bus.start();
        bus.stop();
        System.out.println(bus.getInfo());
        System.out.println("Fuel efficiency: "
                + bus.calculateFuelEfficiency() + " L/100 km");
        bus.charge();
        System.out.println();

        electricCar.start();
        electricCar.stop();
        System.out.println(electricCar.getInfo());
        System.out.println("Energy consumption: "
                + electricCar.calculateFuelEfficiency() + " kWh/100 km");
        electricCar.charge();
        System.out.println();

        electricMotorcycle.start();
        electricMotorcycle.stop();
        System.out.println(electricMotorcycle.getInfo());
        System.out.println("Energy consumption: "
                + electricMotorcycle.calculateFuelEfficiency() + " kWh/100 km");
        electricMotorcycle.charge();
    }
}