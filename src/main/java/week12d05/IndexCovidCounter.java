package week12d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class IndexCovidCounter {

    private List<String> linesOfFile = new ArrayList<>();

    private void readFile() {
        Path path = Path.of("src", "main", "resources", "index.html");
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                linesOfFile.add(line);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public int getCovids() {
        int result = 0;
        readFile();
        for (String actual : linesOfFile) {
            if (actual.contains("koronavírus")) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        IndexCovidCounter indexCovidCounter = new IndexCovidCounter();
        System.out.println(indexCovidCounter.getCovids());
    }

}
