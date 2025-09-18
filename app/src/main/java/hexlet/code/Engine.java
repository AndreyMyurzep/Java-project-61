package hexlet.code;

import java.util.Scanner;

public final class Engine {

    private Engine() {
    }

    public static final int ROUND_COUNT = 3;

    public static void playGame(Scanner scanner, String gameDescription, String[][] gameDataBase) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(gameDescription);


        for (int i = 0; i < ROUND_COUNT; i++) {
            String question = gameDataBase[i][0];
            String answer = gameDataBase[i][1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + answer + "'");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + name + "!");

    }
}
