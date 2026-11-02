public class Bus extends Car {

    private int passengerCount;
    private int maximumPassengers;

    // Constructor
    public Bus(double gasolineTankCapacity, int speed, int maximumPassengers) {
        super(gasolineTankCapacity, speed);
        this.maximumPassengers = maximumPassengers;
        this.passengerCount = 0;
    }

    // Add one passenger
    public boolean passengerEnter() {
        if (passengerCount < maximumPassengers) {
            passengerCount++;
            return true;
        }

        System.out.println("Bus is full.");
        return false;
    }

    // Remove one passenger
    public boolean passengerExit() {
        if (passengerCount > 0) {
            passengerCount--;
            return true;
        }

        System.out.println("There are no passengers on the bus.");
        return false;
    }

    // Get current passenger count
    public int getPassengerCount() {
        return passengerCount;
    }

    // Get maximum passenger count
    public int getMaximumPassengers() {
        return maximumPassengers;
    }
}