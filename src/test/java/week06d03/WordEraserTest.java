package week06d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WordEraserTest {
    @Test
    public void testWordEraser(){
        WordEraser wordEraser = new WordEraser();
        String text1 = wordEraser.eraseWord("alma körte alma alma barack szőlő körte alma meggy", "alma");
        String text2 = "körte barack szőlő körte meggy";
        System.out.println(text1);
        System.out.println(text2);
        assertTrue(text1.equals(text2));
    }
}
