package statemachine.seatheating;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeatHeatingTest {
    @Test
    public void testSeatHeating(){
        SeatHeating seatHeating1 = SeatHeating.LEVELOFF;
        SeatHeating seatHeating2 = SeatHeating.LEVEL3;

        assertEquals(SeatHeating.LEVEL3, seatHeating1.nextLevel());
        assertEquals(SeatHeating.LEVELOFF, seatHeating2.nextLevel());
    }

}