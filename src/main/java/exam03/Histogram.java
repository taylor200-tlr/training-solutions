package exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Histogram {

    private Path path = Path.of("histogram.txt");

    public void readLine(Path path) {
        String line;
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            while ((line = reader.readLine()) != null) {
                createHistogram(line);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file!", ioe);
        }
    }

    public void createHistogram(String line) {
        int result = Integer.parseInt(line);
        for (int i = 0; i < result; i++) {
            System.out.print('*');
        }
        System.out.print("" + "\n");
    }

}
