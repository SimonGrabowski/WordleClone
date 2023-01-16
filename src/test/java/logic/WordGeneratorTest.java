package logic;

import org.junit.jupiter.api.Test;
import java.util.regex.Pattern;
import static org.junit.jupiter.api.Assertions.*;

class WordGeneratorTest {

    private static final String fiveLetterString = "tests";
    private static final String stringWithNumbers = "t3st5";

    @Test
    void checkSizeOfWord() {
        assertEquals(fiveLetterString.length(), WordGenerator.pickRandomWord().length());
    }

    @Test
    void checkIfWordIsString() {
        String string = "tests";
        assertTrue(Pattern.matches("[a-zA-Z]+", fiveLetterString));
        assertFalse(Pattern.matches("[a-zA-Z]+", stringWithNumbers));
    }
}