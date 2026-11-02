public class SportsCarTest {

    public static void main(String[] args) {

        SportsCar sportsCar = new SportsCar(60, 50);

        sportsCar.setTargetSpeed(100);

        System.out.println("Sports Car");
        System.out.println("Initial speed: " + sportsCar.getSpeed());

        sportsCar.turnOnCruiseControl();

        System.out.println("Target speed: " + sportsCar.getTargetSpeed());
        System.out.println("Final speed: " + sportsCar.getSpeed());

        System.out.println(
                "Gasoline consumption: "
                        + sportsCar.getGasolineConsumption()
                        + " L/100km"
        );
    }
}