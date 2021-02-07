package week14d02;

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class ShoppingList {
    private Map<String, List<String>> order = new HashMap<>();
    private Path path;

    public ShoppingList(Path path) {
        this.path = path;
        readFile(path);
    }

    private void readFile(Path file) {
        try {
            List<String> orders = Files.readAllLines(file);
            splitOrders(orders);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    private void splitOrders(List<String> order) {
        Map<String, List<String>> result = new HashMap<>();
        for (String actual : order) {
            this.order.put(getOrderNumber(actual), getOrderedItems(actual));
        }
    }

    private String getOrderNumber(String orderLine) {
        return orderLine.substring((0), orderLine.indexOf(" "));
    }

    private List<String> getOrderedItems(String items) {
        String allItems = items.substring(items.indexOf(" ")).trim();
        List<String> result = Arrays.asList(allItems.split(","));
        Collections.sort(result);
        return result;
    }

    public List<String> getItemsByOrderNumber(){
        List<String> result = new ArrayList<>();

        return result;
    }

    public int getNumberOfSoldItem(String itemName){
        int result = 0;

        return result;
    }

    public int getNumberOfItemByOrderNumber(String orderNumber){
        int result = 0;

        return result;
    }

    public void getItemStatistic(){

    }
}
