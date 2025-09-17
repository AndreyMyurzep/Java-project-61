package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public final class Calc {

    private static final Random RANDOM = new Random();
    private static final int ROUNDS_COUNT = 3;
    private static final int MAX_RANDOM_VALUE = 100;
    private static final int MAX_OPERATION_NUMBER = 3;

    private Calc() {
    }

    public static void play(Scanner scanner) {
        String gameDescription = "What is the result of the expression?";
        String[] question = new String[ROUNDS_COUNT];
        String[] answer = new String[ROUNDS_COUNT];

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int number1 = RANDOM.nextInt(MAX_RANDOM_VALUE);
            int number2 = RANDOM.nextInt(MAX_RANDOM_VALUE);
            int operation = RANDOM.nextInt(MAX_OPERATION_NUMBER);

            question[i] = generateQuestion(number1, number2, operation);
            answer[i] = generateAnswer(number1, number2, operation);
        }
        Engine.playGame(scanner, gameDescription, question, answer);
    }

    private static String generateQuestion(int number1, int number2, int operation) {
        return switch (operation) {
            case 0 -> number1 + " + " + number2;
            case 1 -> number1 + " - " + number2;
            case 2 -> number1 + " * " + number2;
            default -> throw new IllegalStateException("Unexpected value: " + operation);
        };
    }

    private static String generateAnswer(int number1, int number2, int operation) {
        int result = switch (operation) {
            case 0 -> number1 + number2;
            case 1 -> number1 - number2;
            case 2 -> number1 * number2;
            default -> throw new IllegalStateException("Unexpected value: " + operation);
        };
        return String.valueOf(result);
    }
}
