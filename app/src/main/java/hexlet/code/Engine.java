package hexlet.code;

import java.util.Scanner;

public final class Engine {

    private Engine() { }

    private static final int ANSWERS_TO_WIN = 3;

    public static void playGame(Scanner scanner, String gameDescription, String question, String answer) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(gameDescription);

        int correctAnswers = 0;
        while (correctAnswers < ANSWERS_TO_WIN) {
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");

            String userAnswer = scanner.next().trim().toLowerCase();
            if (userAnswer.equals(answer)) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + answer + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }

            System.out.println("Congratulations, " + name + "!");

        }
    }
}

