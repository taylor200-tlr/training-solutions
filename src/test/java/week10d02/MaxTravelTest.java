package week10d02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxTravelTest {
    @Test
    public void testMaxTravel(){
        List <Integer> passengers = Arrays.asList(12, 12, 12, 3, 4, 12, 3, 5, 10, 11, 3);
        System.out.println(MaxTravel.getMaxIndex(passengers));
        assertEquals(4, MaxTravel.getMaxIndex(passengers) );
    }

}