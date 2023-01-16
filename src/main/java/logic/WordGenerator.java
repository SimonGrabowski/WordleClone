package logic;

import java.util.Random;

public class WordGenerator {

    private static final String[] availableWords = {
            "right", "false", "brave"
    };
    public static String generatedWord;

    public static String pickRandomWord() {
        Random random = new Random();
        generatedWord = availableWords[random.nextInt(3)];

        return generatedWord;
    }
}
