package week03;

import org.junit.jupiter.api.Test;
import week03d04.Phone;
import week03d04.PhoneParser;

import static org.junit.jupiter.api.Assertions.assertEquals;


//Teszt osztály
public class PhoneParserTest {

    // Teszt metódus
    @Test
    void testParse() {
        // Given - előkészítés
        PhoneParser parser = new PhoneParser();
        String s = "80-1234567";

        //When - metódus meghívása
        Phone phone = parser.parse(s);

        //System.out.println(phone); - Ez nem jó tesztelés mert nem a gép végzi
        assertEquals("\"80 - 1234567\"", phone.toString());
    }

}
