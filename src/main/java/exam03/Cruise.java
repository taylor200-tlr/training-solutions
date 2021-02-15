package exam03;

import java.time.LocalDate;
import java.util.*;

public class Cruise {
    private Boat boat;
    private LocalDate sailing;
    private double basicPrice;
    private List<Passenger> passengers;

    public Boat getBoat() {
        return boat;
    }

    public LocalDate getSailing() {
        return sailing;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public Cruise(Boat boat, LocalDate sailing, double basicPrice) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basicPrice;
        this.passengers = new ArrayList<>();
    }

    public void bookPassenger(Passenger passenger) {
        if (passengers.size() >= boat.getMaxPassengers()) {
            throw new IllegalArgumentException("There is no more free space on this boat!");
        }
        passengers.add(passenger);
    }

    public double getPriceForPassenger(Passenger passenger) {
        return passenger.getCruiseClass().getPrice() * basicPrice;
    }

    public Passenger findPassengerByName(String name) {
        for (Passenger passenger : passengers) {
            if (passenger.getName().equals(name)) {
                return passenger;
            }
        }
        return null;
    }

    public List<String> getPassengerNamesOrdered() {
        List<String> result = new ArrayList<>();
        for (Passenger passenger : passengers) {
            result.add(passenger.getName());
        }
        Collections.sort(result);
        return result;
    }

    public double sumAllBookingsCharged() {
        double result = 0.0;
        for (Passenger passenger : passengers) {
            result += getPriceForPassenger(passenger);
        }
        return result;
    }

    public Map<CruiseClass, Integer> countPassengerByClass() {
        Map<CruiseClass, Integer> result = new HashMap<>();
        for (Passenger passenger : passengers) {
            if (!result.containsKey(passenger.getCruiseClass())) {
                result.put(passenger.getCruiseClass(), 1);
            } else {
                result.put(passenger.getCruiseClass(), result.get(passenger.getCruiseClass()) + 1);
            }
        }
        return result;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }
}
