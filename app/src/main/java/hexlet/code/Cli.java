package hexlet.code;

import java.util.Scanner;

public final class Cli {

    private Cli() { }

    public static void greatings(Scanner scanner) {

        System.out.print("What is your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        scanner.close();
    }
}
