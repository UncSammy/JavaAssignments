
public class AgeDistribution {

    public static void main(String[] args) {

        // Cumulative percentage and corresponding age
        double[][] distribution = {
                {20, 20},
                {50, 21},
                {100, 22}
        };

        int[] ageCounts = new int[3];

        // Generate 1000 random ages
        for (int i = 0; i < 1000; i++) {

            int randomNumber = (int) (Math.random() * 100) + 1;

            for (int j = 0; j < distribution.length; j++) {

                if (randomNumber <= distribution[j][0]) {
                    ageCounts[j]++;
                    break;
                }
            }
        }

        // Print results
        System.out.println("Generated age distribution:");

        for (int i = 0; i < distribution.length; i++) {
            System.out.println(
                    "Age " + (int) distribution[i][1] +
                            ": " + ageCounts[i] + " students"
            );
        }
    }
}
