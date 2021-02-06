package week13d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterCounterTest {

    @Test
    void countLetter() {

        LetterCounter letterCounter = new LetterCounter();
        assertEquals (11, letterCounter.countLetter("windows are big"));
        assertEquals (7, letterCounter.countLetter("almásrétes"));

    }
}