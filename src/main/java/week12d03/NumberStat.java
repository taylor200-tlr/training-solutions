package week12d03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberStat {

    private List<Integer> numbers = new ArrayList<>();

    public NumberStat(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public int getSmallestSingle() {
        List<Integer> sortedNumbers = numbers;
        Collections.sort(sortedNumbers);
        int result = 0;
        if (numbers.size() >= 1) {
            if (numbers.size() > 2) {
                // 1, 1, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8
                for (int i = 1; i < sortedNumbers.size() - 1; i++) {
                    if (sortedNumbers.get(i-1) != sortedNumbers.get(i) && sortedNumbers.get(i) != sortedNumbers.get(i+1)){
                        result = sortedNumbers.get(i);
                    }
                }
            } else if (numbers.size() == 1) {
                result = numbers.get(0);
            } else {
                result = (numbers.get(0) < numbers.get(1) ? numbers.get(0) : numbers.get(1));
            }
        } else throw new IllegalArgumentException("Parameter is empty");
        return result;
    }
}
