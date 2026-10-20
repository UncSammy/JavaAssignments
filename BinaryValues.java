
import java.util.Scanner;

public class BinaryValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = scanner.nextLine();

        int decimal = 0;

        for (int i = 0; i < binary.length(); i++) {
            char bit = binary.charAt(i);

            if (bit != '0' && bit != '1') {
                System.out.println("Invalid binary number");
                return;
            }

            decimal = decimal * 2 + (bit - '0');
        }

        System.out.println("Decimal: " + decimal);
    }
}
