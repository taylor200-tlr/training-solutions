package exam03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cruise {
    private Boat boat;
    private LocalDate sailing;
    private double basicPrice;
    private List<Passenger> passengers;

    public Cruise(Boat boat, LocalDate sailing, double basicPrice) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basicPrice;
    }

    public void bookPassenger(Passenger passenger){
        passengers.add(passenger);
    }

    public double getPriceForPassenger(Passenger passenger){
        return passenger.getCruiseClass().getPrice() * basicPrice;
    }

    public Passenger findPassengerByName(String name){
        for (Passenger passenger: passengers){
            if (passenger.getName().equals(name)) {
                return passenger;
            }
        }
        return null;
    }

    public List<String> getPassengerNamesOrdered(){
        List<String> result = new ArrayList<>();

        return result;
    }

    public double sumAllBookingsCharged(){
        double result = 0.0;

        return result;
    }

    public Map<CruiseClass, Integer> countPassengerByClass(){
        Map<CruiseClass, Integer> result = new HashMap<>();

        return result;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }
}
