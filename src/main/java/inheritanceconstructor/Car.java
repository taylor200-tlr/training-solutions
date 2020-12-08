package inheritanceconstructor;

public class Car {
    double fuelRate, fuel, tankCapacity;

    public Car() {
    }

    public Car(double fuelRate, double fuel, double tankCapacity) {
        this.fuelRate = fuelRate;
        this.fuel = fuel;
        this.tankCapacity = tankCapacity;
    }

    public void modifyFuelAmount(double fuel) {
        this.fuel = this.fuel + fuel;
    }

    public void drive(int km) {
        fuel = fuel - (km / 100 * fuelRate);
        if (isCanBeDone(km)){
            modifyFuelAmount(fuel);
        }
    }
    public double calculateRefillAmount(){
        return tankCapacity - fuel;
    }

    private boolean isCanBeDone(int km) {
        if (fuel - (km / 100 * fuelRate) < 0) {
            throw new IllegalArgumentException("A távolság nem megtehető");
        }
        return true;
    }
}
