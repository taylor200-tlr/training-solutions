package week06day01;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListSelectorTest {
    @Test
    public void testListSelector() {
        List<String> stringList = new ArrayList<>(Arrays.asList(
                "alma", "körte", "banán", "szőlő", "szilva", "narancs",
                "citrom", "barack", "ananász", "meggy", "mandarin"));
        ListSelector listSelector = new ListSelector();
        listSelector.getOddListElement(stringList);
    }

}
