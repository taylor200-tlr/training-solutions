package inheritanceconstructor;

public class Jeep extends Car{
    private double extraCapacity, extraFuel;

    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel) {
        super(fuelRate, fuel, tankCapacity);
        this.extraCapacity = extraCapacity;
        this.extraFuel = extraFuel;
    }

    public void modifyFuelAmount(double fuel) {

    }

    public void drive(int km) {

    }

    public double calculateRefillAmount() {
        double result = 0;

        return result;
    }
}
