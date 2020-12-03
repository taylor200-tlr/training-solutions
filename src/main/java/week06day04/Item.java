package week06day04;

public class Item {
    private int price, month;
    private String name;

    public Item(String name, int price, int month) {
        this.price = price;
        if (isMonthValid(month)) {
            this.month = month;
        }
        this.name = name;
    }

    public boolean isMonthValid(int month){
        if (month<1 || month>12) {
            throw new IllegalArgumentException("Nem valid hónap");
        }
        return true;
    }
    public int getPrice() {
        return price;
    }

    public int getMonth() {
        return month;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "" + name + ", " + price + ", " + month;
    }
}
