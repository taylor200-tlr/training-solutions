package exam02;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class ArraySelector {

    public static String selectEvens(int[] array) {
        if (array.length == 0){
            return "";
        }
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < array.length; i += 2) {
            result.add(array[i]) ;
        }
        return result.toString();
    }
}
