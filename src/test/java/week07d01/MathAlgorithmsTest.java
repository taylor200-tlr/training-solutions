package week07d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MathAlgorithmsTest {
    @Test
    public void testMathAlgorithms(){
        MathAlgorithms mathAlgorithms = new MathAlgorithms();
        assertFalse(mathAlgorithms.isPrime(12));
        assertFalse(mathAlgorithms.isPrime(1172));
        assertTrue(mathAlgorithms.isPrime(1187));
        assertTrue(mathAlgorithms.isPrime(2));
    }
}