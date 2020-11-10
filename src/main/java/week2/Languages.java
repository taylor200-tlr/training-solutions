package week2;

import java.util.ArrayList;
import java.util.List;

public class Languages {
    public static void main(String[] args) {
        List<String> language = new ArrayList<>();
        language.add("Java");
        language.add("Python");
        language.add("JavaScript");

        for (int i=0; i<language.size(); i++){
            if (language.get(i).length()>5){
                System.out.println(language.get(i));
            }
        }
    }
}
