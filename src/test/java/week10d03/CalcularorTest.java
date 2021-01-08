package week10d03;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.*;

class CalcularorTest {
    @Test
    public void testCalculator(){
        assertEquals(10, Calcularor.findMinSum(new int[] {1, 2, 3, 4, 5}));
        assertEquals(14, Calcularor.findMinSum(new int[] {8, 2, 3, 4, 5}));
        assertEquals(11, Calcularor.findMinSum(new int[] {2, 2, 3, 4, 5}));
    }

}