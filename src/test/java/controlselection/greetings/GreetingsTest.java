package controlselection.greetings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingsTest {
    @Test
    void testGreetings(){
        Greetings greetings = new Greetings();
        String greeting = greetings.greeting(17, 20);

        assertEquals("Jó napot", greeting);
    }
}
