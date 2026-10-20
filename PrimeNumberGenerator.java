
import java.util.Scanner;

public class PrimeNumberGenerator {

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= number / i; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter start: ");
        int start = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter end: ");
        int end = Integer.parseInt(scanner.nextLine());

        if (start <= 0 || start >= end) {
            System.out.println("Enter positive integers with start < end.");
            return;
        }

        System.out.println("Prime numbers:");

        for (int number = start; number <= end; number++) {
            if (isPrime(number)) {
                System.out.println(number);
            }
        }
    }
}
