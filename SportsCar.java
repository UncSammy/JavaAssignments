public class SportsCar extends Car {

    // Constructor
    public SportsCar(double gasolineTankCapacity, int speed) {
        super(gasolineTankCapacity, speed);
    }

    // Better acceleration and deceleration
    @Override
    protected void adjustSpeed() {

        while (getSpeed() < getTargetSpeed()) {
            int newSpeed = Math.min(getSpeed() + 5, getTargetSpeed());
            setSpeed(newSpeed);
        }

        while (getSpeed() > getTargetSpeed()) {
            int newSpeed = Math.max(getSpeed() - 5, getTargetSpeed());
            setSpeed(newSpeed);
        }
    }

    // Higher gasoline consumption
    @Override
    public double getGasolineConsumption() {
        return 10.0;
    }
}