package week08d02;

import org.junit.jupiter.api.Test;

class LotteryTest {
    @Test
    public void testLottery(){
        Lottery lottery = new Lottery();
        System.out.println(lottery.getNumbers());
        System.out.println(lottery.getNewNumbers());

    }
}