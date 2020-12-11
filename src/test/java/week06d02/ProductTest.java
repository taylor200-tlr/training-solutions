package week06d02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {
    @Test
    public void testProduct(){
        Product product1 = new Product("Kaja1", Category.FROZEN, 10);
        Product product2 = new Product("Kaja2", Category.DAIRY, 20);
        Product product6 = new Product("Kaja6", Category.DAIRY, 20);
        Product product3 = new Product("Kaja3", Category.OTHER, 30);
        Product product4 = new Product("Kaja4", Category.BAKEDGOODS, 40);
        Product product5 = new Product("Kaja5", Category.FROZEN, 50);
        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        Store store = new Store(products);
        int categoryNumber = store.getProductByCategoyName(Category.FROZEN);
        assertEquals(2, categoryNumber);
    }
}
