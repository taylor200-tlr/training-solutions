package week08d03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringListTest {
    @Test
    public void testStringList(){
        List<String> first = Arrays.asList("első", "második", "harmadik", "negyedik");
        List<String> second = Arrays.asList("első", "második", "ötödik", "negyedik", "hatodik");
        List<String> result = Arrays.asList("első", "második", "harmadik", "negyedik", "ötödik", "hatodik");
        System.out.println(StringList.stringListUnion(first, second));
        assertEquals(result, StringList.stringListUnion(first, second));
    }

}