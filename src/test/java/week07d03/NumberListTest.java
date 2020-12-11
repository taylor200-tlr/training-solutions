package week07d03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberListTest {
    @Test
    public void testNumberList(){
        List <Integer> randomNumbers1 = Arrays.asList(1, 2, 2, 3, 4, 5);
        List <Integer> randomNumbers2 = Arrays.asList(1, 2, 3, 4, 5, 4);
        assertFalse(NumberList.isIncreasing(randomNumbers2));
        assertTrue(NumberList.isIncreasing(randomNumbers1));
    }
}