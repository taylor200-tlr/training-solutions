package week06day02;

import java.util.ArrayList;
import java.util.List;

public class Store {
    List<Product> products = new ArrayList<>();

    public Store(List<Product> products) {
        this.products = products;
        }

    public int getProductByCategoyName(Category category){
        int result = 0;
            for (Product i: products){
                if (i.getCategory() == category){
                    result++;
                }
            }
        return result;
    }
}
