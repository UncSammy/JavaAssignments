
import java.io.FileWriter;
import java.io.IOException;

public class Task2 {

    public static void main(String[] args) {

        long first = 0;
        long second = 1;

        try (FileWriter writer = new FileWriter("fibonacci.csv")) {

            writer.write("Index;Fibonacci\n");

            for (int i = 0; i < 60; i++) {

                writer.write(i + ";" + first + "\n");

                long next = first + second;

                first = second;
                second = next;
            }

            System.out.println("Fibonacci CSV file created successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
