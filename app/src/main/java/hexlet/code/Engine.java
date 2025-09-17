package hexlet.code;

import java.util.Scanner;

public final class Engine {

    private Engine() {
    }

    private static final int ANSWERS_TO_WIN = 3;

    public static void playGame(Scanner scanner, String gameDescription, String[] question, String[] answer) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(gameDescription);


        for (int i = 0; i < ANSWERS_TO_WIN; i++) {
            System.out.println("Question: " + question[i]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(answer[i])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + answer[i] + "'");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + name + "!");

    }
}
