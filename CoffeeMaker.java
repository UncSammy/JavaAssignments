
public class CoffeeMaker {

    private boolean on = false;
    private String coffeeType = "normal";
    private int coffeeAmount = 10;

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void setCoffeeType(String coffeeType) {
        if (on && (coffeeType.equals("normal")
                || coffeeType.equals("espresso"))) {
            this.coffeeType = coffeeType;
        }
    }

    public void setCoffeeAmount(int coffeeAmount) {
        if (on && coffeeAmount >= 10 && coffeeAmount <= 80) {
            this.coffeeAmount = coffeeAmount;
        }
    }

    public boolean isOn() {
        return on;
    }

    public String getCoffeeType() {
        return coffeeType;
    }

    public int getCoffeeAmount() {
        return coffeeAmount;
    }
}
