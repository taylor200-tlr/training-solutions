package ioreadwritebytes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TemperaturesWriter {
    public void writeTemperatures(Temperatures temperatures, String path) throws IOException {
        Path file = Path.of(path);
        try{
            Files.write(file, temperatures.getData());
        } catch (IOException ioe){
            throw new IllegalArgumentException("Can not read file!", ioe);
        }
    }
}
