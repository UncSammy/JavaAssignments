
import java.util.Scanner;

public class NameGenerator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] firstNames = {
                "John", "Michael", "David", "James", "Robert"
        };

        String[] lastNames = {
                "Smith", "Johnson", "Brown", "Taylor", "Wilson"
        };

        System.out.print("How many random names do you want to generate? ");
        int numberOfNames = scanner.nextInt();

        for (int i = 0; i < numberOfNames; i++) {

            int firstNameIndex = (int) (Math.random() * firstNames.length);
            int lastNameIndex = (int) (Math.random() * lastNames.length);

            String fullName = firstNames[firstNameIndex]
                    + " " + lastNames[lastNameIndex];

            System.out.println(fullName);
        }

        scanner.close();
    }
}
