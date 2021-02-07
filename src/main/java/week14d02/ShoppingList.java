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

    public List<String> getItemsByOrderNumber(String orderNumber) {
        return order.get(orderNumber);
    }

    public int getNumberOfSoldItemByName(String itemName) {
        return getItemStatistic().get(itemName);
    }

    public int getNumberOfItemByOrderNumber(String orderNumber) {
        return order.get(orderNumber).size();
    }

    public Map<String, Integer> getItemStatistic() {
        Map<String, Integer> result = new HashMap<>();
        for (String actualValue : order.keySet()){
            for (String item : order.get(actualValue)){
                if (!result.containsKey(item)){
                    result.put(item, 1);
                }else{
                    result.put(item, result.get(item)+1);
                }
            }
        }
        return result;
    }
}
