package week05d03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListCounter {
    public int aLetterCounter(List<String> aList){
        int counter = 0;
        for (String i: aList){
            if ((i.toUpperCase().startsWith("A")))
            // vagy esetleg így: (i.toUpperCase().substring(0) == "A")
            {
                counter++;
            }
        }
        return counter;
    }

}
