package week13d02;

import org.jetbrains.annotations.NotNull;

import java.time.LocalTime;

public class Flight implements Comparable<Flight>{
    private String id;
    private FlightState flightState;
    private String city;
    private LocalTime time;

    public Flight(String id, FlightState flightState, String city, LocalTime time) {
        this.id = id;
        this.flightState = flightState;
        this.city = city;
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FlightState getFlightState() {
        return flightState;
    }

    public void setFlightState(FlightState flightState) {
        this.flightState = flightState;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    @Override
    public int compareTo(@NotNull Flight o) {
        return this.time.compareTo(o.time);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id='" + id + '\'' +
                ", flightState=" + flightState +
                ", city='" + city + '\'' +
                ", time=" + time +
                '}';
    }
}
