package week12d03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberStatTest {

    List<Integer> numbers1 = Arrays.asList(1, 1, 5, 3, 4, 5, 6, 5, 6, 4, 1, 6, 5, 4);
    List<Integer> numbers2 = Arrays.asList(1);
    List<Integer> numbers3 = Arrays.asList(1, 1);
    List<Integer> numbers4 = Arrays.asList(3, 1);

    @Test
    void getSmallestSingle() {
        assertEquals(3,  new NumberStat(numbers1).getSmallestSingle());
        assertEquals(1,  new NumberStat(numbers2).getSmallestSingle());
        assertEquals(1,  new NumberStat(numbers3).getSmallestSingle());
        assertEquals(1,  new NumberStat(numbers4).getSmallestSingle());
    }
}