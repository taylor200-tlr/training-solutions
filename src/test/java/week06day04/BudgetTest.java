package week06day04;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BudgetTest {
    @Test
    public void testBudget(){
        List<Item> testList = new ArrayList<>();
        Item item1 = new Item("Pohár", 100, 1);
        Item item2 = new Item("Pendrive", 200, 2);
        Item item3 = new Item("Pen", 300, 3);
        Item item4 = new Item("Mouse", 400, 4);
        Item item5 = new Item("Keyboard", 500, 5);
        Item item6 = new Item("Phone", 600, 5);
        testList.add(item1);
        testList.add(item2);
        testList.add(item3);
        testList.add(item4);
        testList.add(item5);
        testList.add(item6);
        Budget budget = new Budget(testList);

        List<Item> asserItems = new ArrayList<>();
        asserItems.add(item5);
        asserItems.add(item6);

        System.out.println(budget.getItemByMonth(5));
        System.out.println(asserItems);
        assertEquals(asserItems, budget.getItemByMonth(5));
    }
}
