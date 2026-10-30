
public class CoffeeMakerDriver {

    public static void main(String[] args) {

        CoffeeMaker coffeeMaker = new CoffeeMaker();

        coffeeMaker.turnOn();
        System.out.println("Coffee maker is on");

        coffeeMaker.setCoffeeType("espresso");
        System.out.println("Coffee type is "
                + coffeeMaker.getCoffeeType());

        coffeeMaker.setCoffeeAmount(50);
        System.out.println("Coffee amount is "
                + coffeeMaker.getCoffeeAmount() + " ml");

        coffeeMaker.turnOff();
        System.out.println("Coffee maker is off");
    }
}
