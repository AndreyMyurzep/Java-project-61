package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Prime {
    private static final Random random = new Random();

    public static void play(Scanner scanner) {
        String gameDiscription = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        int maxValue = 100;
        int number = random.nextInt(maxValue);
        boolean rightAnswer = number >= 2;

        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                rightAnswer = false;
                break;
            }
        }
        String answer = rightAnswer ? "yes" : "no";
        String question = String.valueOf(number);

        Engine.playGame(scanner, gameDiscription, question, answer);
    }
}
