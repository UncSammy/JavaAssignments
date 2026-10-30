
import java.util.Scanner;

public class MaximumSubarraySum {
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

        int maximumSum = numbers[0];
        int startIndex = 0;
        int endIndex = 0;

        for (int i = 0; i < size; i++) {

            int currentSum = 0;

            for (int j = i; j < size; j++) {

                currentSum += numbers[j];

                if (currentSum > maximumSum) {
                    maximumSum = currentSum;
                    startIndex = i;
                    endIndex = j;
                }
            }
        }

        System.out.println();
        System.out.println("Maximum sum: " + maximumSum);
        System.out.println("Integers: "
                + (startIndex + 1) + "-" + (endIndex + 1));

        scanner.close();
    }
}

