package week05d02;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChangeLetterTest {
    @Test
    void testChangeLetter(){
        ChangeLetter changeLetter = new ChangeLetter();
        String engWord = changeLetter.changeVowels("ProgrAmmIng");

        assertEquals("Pr*gr*mm*ng", engWord);
    }
}
