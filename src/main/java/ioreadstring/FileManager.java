package ioreadstring;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    Path file = Path.of("human_names.txt");

    public List<Human> readFromFile(){
        List<Human> peoples = new ArrayList<>();
        try {
            List <String> humanNames = Files.readAllLines(file);
            for (String name: humanNames){
                peoples.add(new Human(name));
            }

        } catch (IOException e) {
            throw new IllegalStateException("Can not read file", e);
        }
        return peoples;
    }

}
