package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public final class Even {
    private static final Random RANDOM = new Random();
    private static final int MAX_VALUE = 100;

    private Even() {
    }

    public static void play(Scanner scanner) {
        String gameDescription = "Answer 'yes' if the number is even, otherwise answer 'no'.";
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
        return (number % 2 == 0) ? "yes" : "no";
    }
}
