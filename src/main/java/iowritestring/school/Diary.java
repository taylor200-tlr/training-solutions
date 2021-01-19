package iowritestring.school;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Diary {

    public void newMark(String studentName, int mark) {
        String name = studentName + ".txt";
        Path file = Path.of("src", "main", "resources", name);

        try {
            if (Files.exists(file)) {
                Files.writeString(file, mark + "\n", StandardOpenOption.APPEND);
            } else {
                Files.writeString(file, Integer.toString(mark));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Cant open file");
        }


    }
}
