package week08d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathAlgorithmsTest {
    @Test
    public void testMathAlgorithms(){
        assertEquals(1, MathAlgorithms.greatestCommonDivisor(12, 7));
        assertEquals(3, MathAlgorithms.greatestCommonDivisor(12, 15));
        assertEquals(12, MathAlgorithms.greatestCommonDivisor(12, 96));
    }

}