
import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Temperature in Fahrenheit: ");
        double fahrenheit = Double.parseDouble(scanner.nextLine());

        double celsius = (fahrenheit - 32) * 5.0 / 9.0;

        System.out.printf("Celsius: %.1f%n", celsius);
    }
}
