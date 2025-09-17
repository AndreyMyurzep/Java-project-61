package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public final class Calc {

    private static final Random random = new Random();
    private Calc() { }

    public static void play(Scanner scanner) {
        String gameDescription = "What is the result of the expression?";
        int maxRandomValue = 100;
        int number1 = random.nextInt(maxRandomValue);
        int number2 = random.nextInt(maxRandomValue);
        int  maxDifferentOperationNumber = 3;
        int operation = random.nextInt(maxDifferentOperationNumber);

        String question = switch (operation) {
            case 0 -> number1 + " + " + number2;
            case 1 -> number1 + " - " + number2;
            case 2 -> number1 + " * " + number2;
            default -> throw new IllegalStateException("Unexpected value: " + operation);
        };

        int rightNumber = switch (operation) {
            case 0 -> number1 + number2;
            case 1 -> number1 - number2;
            case 2 -> number1 * number2;
            default -> throw new IllegalStateException("Unexpected value: " + operation);
        };

        String answer = String.valueOf(rightNumber);

        Engine.playGame(scanner, gameDescription, question, answer);
    }
}
