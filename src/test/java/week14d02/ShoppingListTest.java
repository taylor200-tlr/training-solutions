package week14d02;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingListTest {
    ShoppingList shoppingList = new ShoppingList(Path.of("shoppinglist.txt"));

    @Test
    void getItemsByOrderNumber() {
        System.out.println(shoppingList.getItemsByOrderNumber("W34111"));
    }

    @Test
    void getNumberOfSoldItem() {
        assertEquals(2, shoppingList.getNumberOfSoldItemByName("tomato"));
    }

    @Test
    void getNumberOfItemByOrderNumber() {
        assertEquals(4, shoppingList.getNumberOfItemByOrderNumber("A233"));
        assertEquals(8, shoppingList.getNumberOfItemByOrderNumber("W34111"));
        assertEquals(2, shoppingList.getNumberOfItemByOrderNumber("K8921"));
    }

    @Test
    void getItemStatistic() {
        System.out.println(shoppingList.getItemStatistic());
    }
}