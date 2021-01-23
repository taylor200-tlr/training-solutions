package ioread;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class IdManager {
    private List<String> ids = new ArrayList<>();

    public void readIdsFromFile(String file){
        Path path = Path.of("src", "main", "resources", file);
        String line;
        try (BufferedReader reader = Files.newBufferedReader(path)){
            while ((line = reader.readLine()) != null){
                ids.add(line);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file!", e);
        }
    }

    public List<String> getIds() {
        return ids;
    }

    @Override
    public String toString() {
        return "IdManager{" +
                "ids=" + ids +
                '}';
    }
}
