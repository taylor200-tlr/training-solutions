package week06day02;

public class Product {
    private String name;
    private int price;
    private Category category;

    public Product(String name, Category category, int price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }
}
