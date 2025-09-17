package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public final class GCD {
    private static final Random random = new Random();
    private GCD() { }

    public static void play(Scanner scanner) {
        String gameDiscription = "Find the greatest common divisor of given numbers.";
        int maxValue = 100;
        int a = random.nextInt(maxValue);
        int b = random.nextInt(maxValue);
        String question = a + " " + b;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        String answer = String.valueOf(a);
        Engine.playGame(scanner, gameDiscription, question, answer);
    }
}
