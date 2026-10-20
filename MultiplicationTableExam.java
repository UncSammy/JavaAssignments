
import java.util.Scanner;

public class MultiplicationTableExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int score = 0;

            for (int i = 1; i <= 10; i++) {
                int first = (int) (Math.random() * 10) + 1;
                int second = (int) (Math.random() * 10) + 1;

                System.out.print(first + " * " + second + " = ");
                int answer = Integer.parseInt(scanner.nextLine());

                if (answer == first * second) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Incorrect. The answer is "
                            + (first * second));
                }
            }

            System.out.println("Your score: " + score + "/10");

            if (score == 10) {
                System.out.println(
                        "Congratulations! You have mastered the multiplication tables!"
                );
                break;
            }

            System.out.println("Try again!");
        }
    }
}
