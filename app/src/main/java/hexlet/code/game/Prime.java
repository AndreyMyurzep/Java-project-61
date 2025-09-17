package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Prime {
    private static final Random random = new Random();
    private static final int ROUNDS_COUNT = 3;
    private static final int MAX_VALUE = 100;

    private Prime() { }

    public static void play(Scanner scanner) {
        String gameDescription = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        String[] question = new String[ROUNDS_COUNT];
        String[] answer = new String[ROUNDS_COUNT];

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int number = random.nextInt(MAX_VALUE);

            question[i] = generateQuestion(number);
            answer[i] = generateAnswer(number);
        }

        Engine.playGame(scanner, gameDescription, question, answer);
    }

    private static String generateQuestion(int number) {
        return String.valueOf(number);
    }

    private static String generateAnswer(int number) {
        if (number < 2) {
            return "no";
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return "no";
            }
        }

        return "yes";
    }
}
