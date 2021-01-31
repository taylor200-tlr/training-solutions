package week13d02;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class AirportTest {
    Airport airport = new Airport(Path.of("cities.txt"));

    @Test
    void getFlight() {
        System.out.println(airport.getFlight("WH4925"));
    }

    @Test
    void getFlightByCity() {
        System.out.println(airport.getFlightByCity("Budapest", FlightState.ARRIVAL));
    }

    @Test
    void getEarliestDepartureFlight() {
        System.out.println(airport.getEarliestDepartureFlight());
    }

    @Test
    void isDepartureMoreThanArrival() {
        System.out.println(airport.isDepartureMoreThanArrival());
    }
}