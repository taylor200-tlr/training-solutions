package week11d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisorFinderTest {

    @Test
    void findDivisor() {
        assertEquals(2, DivisorFinder.findDivisor(152));
        assertEquals(1, DivisorFinder.findDivisor(100));
        assertEquals(1, DivisorFinder.findDivisor(25));
        assertEquals(3, DivisorFinder.findDivisor(128));
    }
}