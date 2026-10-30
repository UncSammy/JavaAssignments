
import java.util.Scanner;

public class RemovingDuplicates {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the integers into the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int[] uniqueNumbers = new int[size];
        int uniqueCount = 0;

        for (int i = 0; i < size; i++) {

            boolean duplicate = false;

            for (int j = 0; j < uniqueCount; j++) {

                if (numbers[i] == uniqueNumbers[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                uniqueNumbers[uniqueCount] = numbers[i];
                uniqueCount++;
            }
        }

        System.out.println();
        System.out.println("The array without duplicates:");

        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(uniqueNumbers[i] + " ");
        }

        System.out.println();

        scanner.close();
    }
}
