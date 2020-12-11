package week05d04;

import java.time.LocalDate;

public class Product {
    private String name;
    private int year, month, day;
    private LocalDate expiredDate;

    public Product(String name, int year, int month, int day) {
        this.name = name;
        expiredDate = LocalDate.of(year, month, day);
    }
    public LocalDate getExpiredDate() {
        return expiredDate;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "|" + name + ", " + expiredDate + "|";
    }
}
