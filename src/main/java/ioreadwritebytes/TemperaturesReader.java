package ioreadwritebytes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TemperaturesReader {

    public Temperatures readTemperatures(String path){
        Path file = Path.of(path);
        try {
            byte[] temperatures = Files.readAllBytes(file);
            return new Temperatures(temperatures);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file!", ioe);
        }

    }


}
