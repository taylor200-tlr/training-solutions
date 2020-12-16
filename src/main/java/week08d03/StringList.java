package week08d03;

import java.util.ArrayList;
import java.util.List;

public class StringList {
    public static List<String> stringListUnion(List<String> first, List<String> second){
        List<String> result = new ArrayList<>();
        result.addAll(first);
        for (String i: second){
            if (!first.contains(i)){
                result.add(i);
            }
        }
        return result;
    }
}
