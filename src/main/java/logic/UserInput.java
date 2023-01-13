package logic;

import java.util.Scanner;

public class UserInput {

    private static final Scanner scanner = new Scanner(System.in);

    public static String getUserInput() {
        return scanner.nextLine();
    }
}
