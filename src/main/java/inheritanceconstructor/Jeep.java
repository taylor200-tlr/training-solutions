package inheritanceconstructor;

public class Jeep extends Car{
    private double extraCapacity, extraFuel;

    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel) {
        super(fuelRate, fuel, tankCapacity);
        this.extraCapacity = extraCapacity;
        this.extraFuel = extraFuel;
    }

    @Override
    public void modifyFuelAmount(double fuel) {
        super.modifyFuelAmount(fuel);
    }

    @Override
    public void drive(int km) {
        super.drive(km);
    }

    @Override
    public double calculateRefillAmount() {
        return super.calculateRefillAmount();
    }
}
