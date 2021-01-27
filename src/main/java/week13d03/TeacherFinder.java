package week13d03;
//A fájl tantárgyfelosztást tartalmaz. A tanttárgyfelosztást 4-es blokkokban adjuk meg.
//Első sor a tanár neve, majd a tantárgy, majd az osztály ahol tanítja és végül az, hogy heti hány órában.
//Írj egy metódust, ami paraméterül várja egy tanár nevét, és kiírja, hogy hány órája van egy héten.

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TeacherFinder {

    public int getTeacherInfo(String name) {
        List<String> file = new ArrayList<>();
        int result = 0;
        try {
            file = Files.readAllLines(Path.of("beosztas.txt"));
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        for (int i = 0; i < file.size(); i++) {
            if (file.get(i).equals(name)) {
                result += Integer.parseInt(file.get(i + 3));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Path path = Path.of("beosztas.txt");
        System.out.println(new TeacherFinder().getTeacherInfo(""));
        System.out.println(new TeacherFinder().getTeacherInfo("Albatrosz Aladin"));
        System.out.println(new TeacherFinder().getTeacherInfo("Impala Izabella"));
        System.out.println(new TeacherFinder().getTeacherInfo("Siketfajd Simon"));

    }
}
