package week09d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SantaClausTest {
    @Test
    public void testSantaClaus() {
        List<Person> persons = Arrays.asList(new Person("Anya", 40), new Person("Apa", 45),
                new Person("Papa", 70), new Person("Mama", 65),
                new Person("Fiú", 13), new Person("Lány", 20));
        SantaClaus santaClaus = new SantaClaus(persons);
        santaClaus.getThroughChimneys();
        for (Person person : persons){
            System.out.println(person.getName()+" "+person.getAge()+" "+person.getPresent());
        }
    }

}