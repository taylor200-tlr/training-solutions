package week13d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterCounterTest {

    @Test
    void countLetter() {

        assertEquals (11, new LetterCounter().countLetter("windows are big"));
        assertEquals (7, new LetterCounter().countLetter("almásrétes"));

    }
}