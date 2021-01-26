package week13d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Cities {
    private Path path;
    private List<String> cities = new ArrayList<>();

    private void readFile(Path path) {
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            while (reader.readLine() != null) {
                splitLine(reader.readLine());
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    private void splitLine(String line) {
        String result[] = line.split(";");
        for (int i = 1; i < result.length; i++) {
            cities.add(result[i]);
        }
    }

    public String getLongestCityName() {
        readFile(path);
        String result = "";
        for (String actual : cities) {
            if (actual.length() > result.length()) {
                result = actual;
            }
        }
        return result;
    }

    public Cities(Path path) {
        this.path = path;
    }

    public static void main(String[] args) {
        Path path = Path.of("src", "main", "resources", "telepulesek.txt");
        Cities cities = new Cities(path);
        System.out.println(cities.getLongestCityName());
    }
}
