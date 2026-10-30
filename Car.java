
public class Car {

    private double gasolineTankCapacity;
    private int speed;

    private int targetSpeed;
    private boolean cruiseControlOn = false;

    private int minimumCruiseSpeed = 30;
    private int maximumCruiseSpeed = 120;

    // Default constructor
    public Car() {
    }

    // Additional constructor
    public Car(double gasolineTankCapacity, int speed) {
        this.gasolineTankCapacity = gasolineTankCapacity;
        this.speed = speed;
    }

    // Set target speed
    public void setTargetSpeed(int targetSpeed) {
        this.targetSpeed = targetSpeed;
    }

    // Get target speed
    public int getTargetSpeed() {
        return targetSpeed;
    }

    // Get current speed
    public int getSpeed() {
        return speed;
    }

    // Turn cruise control on
    public boolean turnOnCruiseControl() {

        if (targetSpeed < minimumCruiseSpeed
                || targetSpeed > maximumCruiseSpeed) {
            cruiseControlOn = false;
            return false;
        }

        adjustSpeed();
        cruiseControlOn = true;
        return true;
    }

    // Accelerate or decelerate to target speed
    private void adjustSpeed() {

        while (speed < targetSpeed) {
            speed++;
        }

        while (speed > targetSpeed) {
            speed--;
        }
    }

    // Turn cruise control off
    public void turnOffCruiseControl() {
        cruiseControlOn = false;
    }
}
