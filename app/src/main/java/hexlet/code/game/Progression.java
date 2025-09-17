package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Progression {
    private static final Random random = new Random();

    public static void play(Scanner scanner) {
        String gameDiscription = "What number is missing in the progression?";
        int firstElementMinValue = 1;
        int firstElementMaxValue = 9;
        int indexMinValue = 1;
        int indexMaxValue = 9;
        int maxSequenceLength = 10;
        int firstElement = random.nextInt(firstElementMinValue, firstElementMaxValue);
        int index = random.nextInt(indexMinValue, indexMaxValue);
        int randomPlace = random.nextInt(maxSequenceLength);
        String[] arr = new String[maxSequenceLength];

        for (int i = 0; i < maxSequenceLength; i++) {
            arr[i] = String.valueOf(firstElement + index * i);
        }
        String answer = arr[randomPlace];

        arr[randomPlace] = "..";
        String question = String.join(" ", arr);
        Engine.playGame(scanner, gameDiscription, question, answer);
    }
}
