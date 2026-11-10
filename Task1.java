
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class Task1 {

    public static void main(String[] args) {

        String url = "https://users.metropolia.fi/~jarkkov/temploki.csv";

        double sum = 0;
        int count = 0;

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new URL(url).openStream(),
                        StandardCharsets.UTF_8))) {

            String header = reader.readLine();

            if (header == null) {
                System.out.println("CSV file is empty.");
                return;
            }

            System.out.println("CSV HEADER: " + header);

            // Detect CSV separator
            String delimiter = header.contains(";") ? ";" : ",";

            String[] columns = header.split(delimiter, -1);

            int temperatureColumn = -1;
            int dateColumn = 0;

            // Find correct columns
            for (int i = 0; i < columns.length; i++) {

                String column = columns[i]
                        .replace("\"", "")
                        .trim();

                if (column.equalsIgnoreCase("UlkoTalo")) {
                    temperatureColumn = i;
                }

                if (column.equalsIgnoreCase("Aika")
                        || column.equalsIgnoreCase("Date")) {
                    dateColumn = i;
                }
            }

            if (temperatureColumn == -1) {
                System.out.println("UlkoTalo column not found.");
                return;
            }

            String line;

            while ((line = reader.readLine()) != null) {

                String[] values = line.split(delimiter, -1);

                if (values.length <= Math.max(dateColumn, temperatureColumn)) {
                    continue;
                }

                String dateText = values[dateColumn]
                        .replace("\"", "")
                        .trim();

                // Check date: 1 January 2023
                if (!dateText.contains("1.1.2023")
                        && !dateText.startsWith("01.01.2023")
                        && !dateText.startsWith("2023-01-01")) {
                    continue;
                }

                String temperatureText = values[temperatureColumn]
                        .replace("\"", "")
                        .trim()
                        .replace(",", ".");

                try {

                    double temperature =
                            Double.parseDouble(temperatureText);

                    sum += temperature;
                    count++;

                } catch (NumberFormatException e) {
                    // Skip invalid measurements
                }
            }

            // Calculate average
            if (count > 0) {

                double average = sum / count;

                System.out.printf(
                        Locale.US,
                        "Average temperature on 1.1.2023: %.2f °C%n",
                        average
                );

                System.out.println("Measurements: " + count);

            } else {

                System.out.println("No measurements found.");
                System.out.println("Check the CSV date format and columns.");
            }

        } catch (Exception e) {

            System.out.println("Error reading CSV file:");
            e.printStackTrace();
        }
    }
}
