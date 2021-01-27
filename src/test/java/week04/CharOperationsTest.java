package week04;

import org.junit.jupiter.api.Test;
import week04d02.Search;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharOperationsTest {
    @Test
    void testCharOperations() {
        Search charOperations = new Search();
        List<Integer> charsPos = Arrays.asList(1, 4);
        List<Integer> positions = charOperations.getPositionOfChar("alma", 'a');
        assertEquals(charsPos, positions);
    }


}
