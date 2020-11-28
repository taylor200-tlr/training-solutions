package week05day05;

import org.junit.jupiter.api.Test;
import week05d05.User;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    @Test
    public void testUser(){
        User user = new User("Tibor", "Szabó", "valami@akarmi.hu");
        assertEquals("Szabó Tibor", user.getFullName("Szabó", "Tibor"));
    }

}
