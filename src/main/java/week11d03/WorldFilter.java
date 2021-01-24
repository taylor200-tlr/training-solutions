package week11d03;

import java.util.ArrayList;
import java.util.List;

public class WorldFilter {

    public List<String> wordsWithChar(List<String> words, char c){
        List<String> result = new ArrayList<>();
        if (words != null){
            for (String s: words){
                if (s.indexOf(c)>=0){
                    result.add(s);
                }
            }
        }else {
            throw new IllegalArgumentException("Üres lista");
        }
        return result;
    }
}
