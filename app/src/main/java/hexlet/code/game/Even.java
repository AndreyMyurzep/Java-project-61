package hexlet.code.game;

import java.util.Scanner;

public final class Even {
    private static final int MOD = 100;

    private Even() {
    }

    private static final int ANSWER_TO_WIN = 3;

    public static void play(Scanner scanner) {

        System.out.println("Welcome to the Brain Games!");
        System.out.print("What is your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int correctAnswers = 0;

        while (correctAnswers < ANSWER_TO_WIN) {
            int number = (int) (Math.random() * MOD);
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");

            String answer = scanner.next().trim().toLowerCase();
            boolean rightNumber = number % 2 == 0;

            if ((rightNumber && answer.equals("yes")) || (!rightNumber && answer.equals("no"))) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                String rightAnswer = rightNumber ? "yes" : "no";
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + rightAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
