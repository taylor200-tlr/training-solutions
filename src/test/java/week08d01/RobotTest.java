package week08d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RobotTest {
    @Test
    public void testRobot() {
        Robot r2d2 = new Robot();
        System.out.println(r2d2.move("jjbbjbfbllljjjjjLLL"));
        assertEquals(4, r2d2.position.getX());
        assertEquals(-5, r2d2.position.getY());
        //assertTrue("4, -5".equals(r2d2.move("jjbbjbfbllljjjjjLLL")));

    }

}