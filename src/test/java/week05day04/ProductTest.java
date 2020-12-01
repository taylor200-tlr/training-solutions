package week05day04;

import org.junit.jupiter.api.Test;

public class ProductTest {
    @Test
    public void testProduct(){
        Product product3 = new Product("Mars csoki", 2018, 6, 12);
        Product product1 = new Product("Kakaóscsiga", 2020, 11, 28);
        Product product2 = new Product("Donatellás falinaptár", 2017, 12, 31);
        Product product4 = new Product("Nuca Cola", 2289, 12, 31);
        Store store = new Store();
        store.addProduct(product1);
        store.addProduct(product2);
        store.addProduct(product3);
        store.addProduct(product4);
        System.out.println(store);
        System.out.println(store.getNumberOfExpired());
    }
}
