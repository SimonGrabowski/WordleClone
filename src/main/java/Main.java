import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    private static final String[] wordsList = {
            "stein", "markt", "wurst"
    };

    public static void main(String[] args) {
        String generatedWord = generateWord();
        System.out.println(generatedWord);
        Scanner scanner = new Scanner(System.in);
        String userInput;
        int amountTries = 5;
        do {
            userInput = scanner.nextLine();
            if (!checkIfInputInvalid(userInput)) {
                amountTries--;
                System.out.println(compareInputWithSolution(userInput, generatedWord));
                System.out.println("REMAINING TRIES: " + amountTries);
            }
            System.out.println(userInput.equals(generatedWord));
        } while (amountTries != 0);
    }

    private static String generateWord() {
        Random random = new Random();

        return wordsList[random.nextInt(3)];
    }

    private static boolean checkIfInputInvalid(String userInput) {
        if (userInput.length() != 5) {
            System.err.println("Input has to be 5 letters long");
            return true;
        } else if (!Pattern.matches("[a-zA-Z]+", userInput)) {
            System.err.println("NON-CHAR INVALID!");
            return true;
        }

        return false;
    }

    private static String compareInputWithSolution(String userInput, String generatedWord) {
        StringBuilder tempWord = new StringBuilder();
        for (int i = 0; i < generatedWord.length(); i++) {
            if (userInput.charAt(i) == generatedWord.charAt(i)) {
                tempWord.append(userInput.charAt(i)).append(" ");
            } else {
                tempWord.append("❒ ");
            }
        }
        if (checkIfInputIdentical(userInput, generatedWord)) {
            System.out.println("CORRECT WORD FOUND!");
            System.exit(0);
        }
        return tempWord.toString();
    }

    private static boolean checkIfInputIdentical(String userInput, String generatedWord) {
        return userInput.equals(generatedWord);
    }
}
