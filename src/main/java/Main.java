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
        do {
            userInput = scanner.nextLine();
        } while (checkIfInputInvalid(userInput));
        System.out.println(compareInputWithSolution(userInput, generatedWord));
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
        return tempWord.toString();
    }
}
