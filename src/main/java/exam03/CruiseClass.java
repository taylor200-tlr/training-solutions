package exam03;

public enum CruiseClass {
    LUXURY(3.0), FIRST(1.8), SECOND(1.0);

    private final double price;

    CruiseClass(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
