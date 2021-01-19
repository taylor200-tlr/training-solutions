package iowritestring.school;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Diary {

    public void newMark(String studentName, int mark) {
        String name = studentName + ".txt";
        Path file = Path.of("src", "main", "resources", name);

        try {
            if (Files.exists(file)) {
                Files.writeString(file, mark + "\n", StandardOpenOption.APPEND);
            } else {
                Files.writeString(file, Integer.toString(mark) + "\n");
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Cant open file");
        }


    }

    public void average(String studentName) {
        double avg = 0.0;
        int sum = 0;
        String name = studentName + ".txt";
        Path file = Path.of("src", "main", "resources", name);
        if (Files.exists(file)) {
            try {
                List<String> marks = Files.readAllLines(file);
                for (String i : marks) {
                    sum += Integer.parseInt(i);
                }
                avg = sum / marks.size();
                Files.writeString(file, String.valueOf(avg), StandardOpenOption.APPEND);
            } catch (IOException e) {
                throw new IllegalStateException("Cant Read the File", e);
            }

        }
    }
}
