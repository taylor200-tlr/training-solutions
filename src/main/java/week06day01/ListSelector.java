package week06day01;

import java.util.List;

public class ListSelector {

    public void getOddListElement(List<String> stringList) {
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < stringList.size(); i++) {
            if ((i % 2) == 1) {
                text.append("[").append(stringList.get(i)).append("] ");
            }
        }
        System.out.println("" + text.toString());
    }
}
