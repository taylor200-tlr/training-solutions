package week07d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LabTest {
    @Test
    public void testLab(){
        Lab lab = new Lab("week07d04");
        lab.complete();
        System.out.println(lab);
    }

}