package week08d02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lottery {
    private List<Integer> winnerNumbers = new ArrayList<>();

    public Lottery(List<Integer> winnerNumbers) {
        this.winnerNumbers = winnerNumbers;
    }

    public void getFiveNumbers() {
        Random random = new Random();
        for (int i = 1; i < 6; i++) {
            winnerNumbers.add(random.nextInt(90) + 1);
        }
        isDifferent(winnerNumbers);
    }

    private boolean isDifferent(List<Integer> lotteryNumbers) {
        Collections.sort(lotteryNumbers);
        for (int i = 0; i < 4; i++) {
            if (lotteryNumbers.get(i) == lotteryNumbers.get(i + 1)){
                lotteryNumbers.clear();
                getFiveNumbers();
            }
        }
        return true;
    }
}
