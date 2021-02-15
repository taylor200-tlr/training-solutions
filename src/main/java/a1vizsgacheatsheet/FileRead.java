package a1vizsgacheatsheet;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileRead {

    // File beolvasása soronként
    public String readLine(Path path){
        String line;
        try(BufferedReader reader = Files.newBufferedReader(path)){
            while ((line = reader.readLine()) != null ){
                System.out.println(line);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file!", ioe);
        }
        return line;
    }

    //File beolvasása Listába, egyben
    public List<String> readFile(Path path){
        List<String> result;
        try {
            result = Files.readAllLines(path);
        } catch (Exception ioe) {
            throw new IllegalStateException("Can not read file!", ioe);
        }
        return result;
    }

    public static void main(String[] args) {
        FileRead fileRead = new FileRead();
        Path pathLargeFile = Path.of("data.csv");
        Path pathSmallFile = Path.of("shoppinglist.txt");
        fileRead.readLine(pathLargeFile);
        System.out.println(fileRead.readFile(pathSmallFile));
    }
}
