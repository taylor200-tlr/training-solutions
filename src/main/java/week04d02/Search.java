package week04d02;

import java.util.ArrayList;
import java.util.List;

public class Search {
    public List<Integer> getPositionOfChar(String base, char part){
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < base.length(); i++){
            if (base.charAt(i) == part){
                result.add(i + 1);
            }
        }
        return result;
    }

}
