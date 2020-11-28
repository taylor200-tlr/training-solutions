package week05day04;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Store {
    List<Product> products = new ArrayList<>();
    public void addProduct(Product product){
        products.add(product);
    }

    public int getNumberOfExpired(){
        int result = 0;
        for (Product product: products){
            if (product.getExpiredDate().isBefore(LocalDate.now())){
                result ++;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Store products: " + products;
    }
}
