package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public final class Progression {
    private static final Random RANDOM = new Random();
    private static final int FIRST_ELEMENT_MIN_VALUE = 1;
    private static final int FIRST_ELEMENT_MAX_VALUE = 9;
    private static final int INDEX_MIN_VALUE = 1;
    private static final int INDEX_MAX_VALUE = 9;
    private static final int MAX_SEQUENCE_LENGTH = 10;

    private Progression() {
    }

    public static void play(Scanner scanner) {
        String gameDiscription = "What number is missing in the progression?";
        String[][] gameDataBase = new String[Engine.ROUND_COUNT][2];

        for (int i = 0; i < Engine.ROUND_COUNT; i++) {
            int firstElement = RANDOM.nextInt(FIRST_ELEMENT_MIN_VALUE, FIRST_ELEMENT_MAX_VALUE);
            int index = RANDOM.nextInt(INDEX_MIN_VALUE, INDEX_MAX_VALUE);
            int randomPlace = RANDOM.nextInt(MAX_SEQUENCE_LENGTH);

            gameDataBase[i][0] = generateQuestion(firstElement, index, randomPlace);
            gameDataBase[i][1] = generateAnswer(firstElement, index, randomPlace);
        }
        Engine.playGame(scanner, gameDiscription, gameDataBase);
    }

    private static String generateQuestion(int firstElement, int index, int randomPlace) {
        String[] progression = new String[MAX_SEQUENCE_LENGTH];

        for (int i = 0; i < MAX_SEQUENCE_LENGTH; i++) {
            progression[i] = String.valueOf(firstElement + index * i);
        }

        progression[randomPlace] = "..";
        return String.join(" ", progression);
    }

    private static String generateAnswer(int firstElement, int index, int randomPlace) {
        int answerValue = firstElement + index * randomPlace;
        return String.valueOf(answerValue);
    }
}
