package week08d02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LotteryTest {
    @Test
    public void testLottery(){
        List<Integer> winnerNumbers = new ArrayList<>();
        Lottery lottery = new Lottery(winnerNumbers);
        lottery.getFiveNumbers();
        System.out.println(winnerNumbers);

    }
}