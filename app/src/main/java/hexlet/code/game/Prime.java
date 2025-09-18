package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public final class Prime {
    private static final Random RANDOM = new Random();
    private static final int MAX_VALUE = 100;

    private Prime() { }

    public static void play(Scanner scanner) {
        String gameDescription = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] gameDataBase = new String[Engine.ROUND_COUNT][2];

        for (int i = 0; i < Engine.ROUND_COUNT; i++) {
            int number = RANDOM.nextInt(MAX_VALUE);

            gameDataBase[i][0] = generateQuestion(number);
            gameDataBase[i][1] = generateAnswer(number);
        }

        Engine.playGame(scanner, gameDescription, gameDataBase);
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
