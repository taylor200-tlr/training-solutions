package week14d01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Indexer {

    public Map<Character, List<String>> index(List<String> names){

        Map<Character, List<String>> result = new HashMap<>();
        char initialLetter;

        for (String name: names){
            initialLetter = name.charAt(0);
            if (result.containsKey(initialLetter)){
                result.get(initialLetter).add(name);
            } else {
                result.put(initialLetter, new ArrayList<>());
                result.get(initialLetter).add(name);
            }
        }
        return result;
    }

}
