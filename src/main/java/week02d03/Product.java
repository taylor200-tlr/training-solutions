package week02d03;

public class Product {
    private String name, code;

    public Product(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }
    public boolean areTheyEqual(Product p){
        return name.equals(p.name) && (code.length() - p.code.length()<=1) ; // abszolút érték 1nek kellene lennie
    }

    public static void main(String[] args) {
        Product product1 = new Product("Mars csoki", "1234");
        Product product2 = new Product("Mars csoki", "12345");
        Product product3 = new Product("Mars", "1234");

        System.out.println(product1.areTheyEqual(product2));
        System.out.println(product1.areTheyEqual(product3));
        System.out.println(product2.areTheyEqual(product3));
    }
}
