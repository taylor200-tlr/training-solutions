package week08d02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lottery {
    private List<Integer> winnerNumbers = new ArrayList<>();

    public Lottery() {
    }

    public List<Integer> getNumbers() {
        getFiveNumbers();
        return winnerNumbers;
    }

    private void getFiveNumbers() {
        Random random = new Random();
        for (int i = 1; i < 6; i++) {
            winnerNumbers.add(random.nextInt(90) + 1);
        }
        isDifferent(winnerNumbers);
    }

    private void isDifferent(List<Integer> lotteryNumbers) {
        Collections.sort(lotteryNumbers);
        for (int i = 0; i < 4; i++) {
            if (lotteryNumbers.get(i).equals(lotteryNumbers.get(i + 1))) {
                lotteryNumbers.clear();
                getFiveNumbers();
            }
        }
    }

    // Másik megoldás
    public List<Integer> getNewNumbers() {
        winnerNumbers.clear();
        Random random = new Random();
        int pickedNumber;
        do {
            pickedNumber = random.nextInt(90) + 1;
            if (!winnerNumbers.contains(pickedNumber)){
            winnerNumbers.add(pickedNumber);
            }
        }
        while (winnerNumbers.size() < 5);
        return winnerNumbers;
    }
}
