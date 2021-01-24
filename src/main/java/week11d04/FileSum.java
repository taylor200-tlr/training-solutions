package week11d04;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileSum {

    public int readFile(String name) {
        Path path = Path.of("src", "main", "resources", name);
        try {
            String content = Files.readString(path);
            int number = Integer.parseInt(content);
            return number;
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file!", e);
        }
    }
    public int sumNumbers(){
        int result = 0;
        String filename = "";
        for (int i=0;i<100;i++){
            //filename = String.format("number%02d.txt", i); <--Egy sorban a filenév beállítás
            //filename = "number" + (i<10 ? "0" : i) + ".txt";  <--Egy sorban a következő if szerkezet
            if (i<10){
                filename = "number0" + i + ".txt";
            }else{
                filename = "number" + i + ".txt";
            }
            if (Files.isRegularFile(Path.of(filename))){
                result += readFile(filename);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new FileSum().sumNumbers());
    }
}
