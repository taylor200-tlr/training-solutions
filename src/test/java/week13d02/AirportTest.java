package week13d02;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

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

    @Test
    void getFlightsTest(){
        List<Flight> flight = airport.getFlightsTest();
        for (Flight flight1:flight){
            System.out.println(flight1);
        }

    }
}