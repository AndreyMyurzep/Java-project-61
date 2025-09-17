package hexlet.code;

import hexlet.code.game.Calc;
import hexlet.code.game.Even;
import hexlet.code.game.GCD;
import hexlet.code.game.Prime;
import hexlet.code.game.Progression;

import java.util.Scanner;

public class App {
    private static final int EXIT = 0;
    private static final int WELCOME = 1;
    private static final int GAME_EVEN = 2;
    private static final int GAME_CALC = 3;
    private static final int GAME_GCD = 4;
    private static final int GAME_PROGRESSION = 5;
    private static final int GAME_PRIME = 6;

    public static void main(String[] args) {

        System.out.println("Welcome to the Brain Games!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case EXIT:
                System.out.println("Goodbye!");
                break;
            case WELCOME:
                Cli.greatings(scanner);
                break;
            case GAME_EVEN:
                Even.play(scanner);
                break;
            case GAME_CALC:
                Calc.play(scanner);
                break;
            case GAME_GCD:
                GCD.play(scanner);
                break;
            case GAME_PROGRESSION:
                Progression.play(scanner);
                break;
            case GAME_PRIME:
                Prime.play(scanner);
                break;
            default:
                System.out.println("Invalid choice! Please select a number between 0 and 6.");
        }
        scanner.close();
    }
}
