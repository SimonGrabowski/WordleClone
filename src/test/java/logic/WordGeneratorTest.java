package logic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertTrue;

class WordGeneratorTest {

    private static final String fiveLetterString = "tests";

    @Test
    void checkSizeOfWord() {
        Assertions.assertEquals(fiveLetterString.length(), WordGenerator.pickRandomWord().length());
    }

    @Test
    void checkIfWordIsStringWithOnlyLetters() {
        assertTrue(Pattern.matches("[a-zA-Z]+", WordGenerator.pickRandomWord()));
    }
}