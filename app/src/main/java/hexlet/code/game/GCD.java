package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public final class GCD {
    private static final Random RANDOM = new Random();
    private static final int MAX_VALUE = 100;

    private GCD() {
    }

    public static void play(Scanner scanner) {
        String gameDescription = "Find the greatest common divisor of given numbers.";
        String[][] gameDataBase = new String[Engine.ROUND_COUNT][2];

        for (int i = 0; i < Engine.ROUND_COUNT; i++) {
            int a = RANDOM.nextInt(MAX_VALUE);
            int b = RANDOM.nextInt(MAX_VALUE);

            gameDataBase[i][0] = generateQuestion(a, b);
            gameDataBase[i][1] = generateAnswer(a, b);
        }

        Engine.playGame(scanner, gameDescription, gameDataBase);
    }

    private static String generateQuestion(int a, int b) {
        return a + " " + b;
    }

    private static String generateAnswer(int a, int b) {
        int num1 = a;
        int num2 = b;

        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }

        return String.valueOf(num1);
    }
}
