package week07day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
class DigitSumTest {
    @Test
    public void testDigitSum(){
        DigitSum digitSum = new DigitSum();
        assertEquals(-55, digitSum.sumOfDigits(-10));
        assertEquals(6, digitSum.sumOfDigits(3));
        assertEquals(15, digitSum.sumOfDigits(5));
    }
}