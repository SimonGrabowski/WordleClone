package logic;

import java.util.Random;

public class WordGenerator {

    private static final String[] availableWords = {
            "right", "false", "brave"
    };

    public static String pickRandomWord() {
        Random random = new Random();

        return availableWords[random.nextInt(3)];
    }
}
