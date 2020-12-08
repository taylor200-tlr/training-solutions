package inheritanceconstructor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JeepTest {
    @Test
    public void testJeep(){
    Jeep jeep = new Jeep(5.5, 40, 40, 20, 20);
    jeep.drive(200);
    System.out.println(jeep.calculateRefillAmount());
    }
}