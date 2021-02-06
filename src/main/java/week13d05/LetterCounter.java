package week13d05;

import java.util.HashSet;
import java.util.Set;

public class LetterCounter {

    public int countLetter(String text){
        Set<Character> letters = new HashSet<>();
        for (char c: text.toLowerCase().toCharArray()){
            if ((c >= 'a') && (c <= 'z')) {
                letters.add(c);
            }
        }
        return letters.size();
    }
}
