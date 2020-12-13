package enumabstract;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderStateTest {
    @Test
    public void testCanDeleted(){
        Deletable deletable1 = OrderState.CONFIRMED;
        Deletable deletable2 = OrderState.DELIVERED;

        assertFalse(deletable2.canDelete());
        assertTrue(deletable1.canDelete());
    }
}