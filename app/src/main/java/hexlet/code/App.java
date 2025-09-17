package hexlet.code;

import hexlet.code.game.Calc;
import hexlet.code.game.Even;
import hexlet.code.game.GCD;
import hexlet.code.game.Prime;
import hexlet.code.game.Progression;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
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
            case 0:
                System.out.println("Goodbye!");
                break;
            case 1:
                Cli.greatings(scanner);
                break;
            case 2:
                Even.play(scanner);
                break;
            case 3:
                Calc.play(scanner);
                break;
            case 4:
                GCD.play(scanner);
                break;
            case 5:
                Progression.play(scanner);
                break;
            case 6:
                Prime.play(scanner);
                break;
            default:
                System.out.println("Invalid choice! Please select a number between 0 and 6.");
        }
        scanner.close();
    }
}
