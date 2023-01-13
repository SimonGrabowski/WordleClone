package logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordGeneratorTest {

    @Test
    void checkSizeOfWord() {
        String expected = "tests";
        assertEquals(expected.length(), WordGenerator.pickRandomWord().length());
    }

    @Test
    void checkIfWordIsString() {

    }
}