package week06d04;

import java.util.ArrayList;
import java.util.List;

public class Budget {
    private List<Item> budgetItems = new ArrayList<>();

    public Budget(List<Item> items) {
        budgetItems = items;
    }
    public List getItemByMonth(int itemMonth){
        List<Item> result = new ArrayList<>();
        for (Item i: budgetItems){
            if (i.getMonth() == itemMonth){
                result.add(i);
            }
        }
        return result;
    }
}
