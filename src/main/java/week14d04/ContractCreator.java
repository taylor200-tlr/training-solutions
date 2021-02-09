package week14d04;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ContractCreator {
    private Contract template;

    public ContractCreator(String name, List<Integer> monthlyPrices){
        template = new Contract(name, monthlyPrices);

    }

    public Contract create(String newClient){
        return new Contract(newClient, new ArrayList<>(template.getMonthlyPrices()));
    }

}
