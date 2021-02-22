package exam03retake01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class OwlCounter {

    private Map<String, Integer> owlsByRegion = new HashMap<>();

    public void readFromFile(BufferedReader reader) throws IOException {
        String line;
        String[] dataLine;
        while ((line = reader.readLine()) != null) {
            dataLine = line.split("=");
            owlsByRegion.put(dataLine[0], Integer.parseInt(dataLine[1]));
            System.out.println(line);
        }
    }

    public int getNumberOfOwls(String region) {
        return owlsByRegion.get(region);
    }
}
