package week14d05;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class HachikoWordCounter {
    public Map<String, Integer> countWords(BufferedReader reader, String... words) {
        Map<String, Integer> result = new HashMap<>();
        String line;
        try {
            while ((line = reader.readLine()) != null) {
 //               System.out.println(line);
                for (String word: words){
                    if (line.contains(word)){
                        Integer prevValue = result.get(word);
                        if (prevValue == null){
                            result.put(word, 1);
                        }else{
                            result.put(word, prevValue + 1);
                        }
                    }
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        return result;
    }

    public static void main(String[] args) {
        try (BufferedReader reader = Files.newBufferedReader(Path.of("Hachiko.srt"))){
            System.out.println(new HachikoWordCounter().countWords(reader, "Hachiko", "haza", "pályaudvar", "jó"));
        } catch (IOException e) {
            throw new IllegalStateException("Error read lines");
        }


    }
}
