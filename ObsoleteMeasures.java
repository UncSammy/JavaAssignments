
import java.util.Scanner;

public class ObsoleteMeasures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Weight (g): ");
        double grams = Double.parseDouble(scanner.nextLine());

        double gramsPerNaula = 32 * 13.28;
        double gramsPerLeiviska = 20 * gramsPerNaula;

        int leiviska = (int) (grams / gramsPerLeiviska);
        double remainingGrams = grams - leiviska * gramsPerLeiviska;

        int naula = (int) (remainingGrams / gramsPerNaula);
        remainingGrams -= naula * gramsPerNaula;

        double luoti = remainingGrams / 13.28;

        System.out.printf(
                "%s grams is %d leiviskä, %d naula, and %.2f luoti.%n",
                formatGrams(grams), leiviska, naula, luoti
        );
    }

    private static String formatGrams(double grams) {
        if (grams == (long) grams) {
            return String.valueOf((long) grams);
        }
        return String.valueOf(grams);
    }
}
