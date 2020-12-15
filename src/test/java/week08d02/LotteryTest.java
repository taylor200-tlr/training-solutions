package week08d02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LotteryTest {
    @Test
    public void testLottery(){
        Lottery lottery = new Lottery();
        System.out.println(lottery.getWinnerNumbers());

    }
}