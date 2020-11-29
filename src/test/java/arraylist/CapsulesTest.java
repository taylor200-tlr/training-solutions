package arraylist;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CapsulesTest {
    @Test
    public void testCapsules(){
        Capsules capsules = new Capsules();
        capsules.addFirst("zöld");
        capsules.addFirst("fehér");
        capsules.addFirst("piros");
        capsules.getColors();
        capsules.removeFirst();
        capsules.removeLast();
        capsules.getColors();
        //assertEquals(List.of("[fehér]"), List.of(capsules));
        //assertEquals(true, List.of(capsules).toString().equals("[fehér]") );
    }
}
