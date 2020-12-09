package week07day03;

import java.util.List;

public class NumberList {
    public static boolean isIncreasing(List<Integer> numbers) {
        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i) > numbers.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
