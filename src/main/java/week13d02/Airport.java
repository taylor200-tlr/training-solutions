package week13d02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Airport {
    private List<Flight> flights;
    private List<String> flight;
    private Path path;

    public Airport(Path path) {
        this.path = path;
        flights = getFlifgts();
    }

    private void readFile() {
        try {
            flight = Files.readAllLines(path);
        } catch (
                IOException e) {
            throw new IllegalStateException("Can not read file", e);
        }
    }

    private List<Flight> getFlifgts() {
        List<Flight> result = new ArrayList<>();
        readFile();
        for (String actual : flight) {
            result.add(getFlightsRow(actual));
        }
        return result;
    }

    private Flight getFlightsRow(String row) {
        String[] flight = row.split(" ");
        return new Flight(
                flight[0],
                flight[1].equals("Arrival") ? FlightState.ARRIVAL : FlightState.DEPARTURE,
                flight[2],
                LocalTime.parse(flight[3]));
    }

    public Flight getFlight(String flightId) {
        Flight result = null;
        getFlifgts();
        for (Flight flight : flights) {
            if (flight.getId().equals(flightId)) {
                result = flight;
            }
        }
        return result;
    }

    public List<Flight> getFlightByCity(String cityName, FlightState flightState) {
        List<Flight> result = new ArrayList<>();
        for (Flight actual : flights) {
            if (actual.getCity().equals(cityName) && actual.getFlightState().equals(flightState)) {
                result.add(actual);
            }
        }
        return result;
    }

    public Flight getEarliestDepartureFlight() {
        Flight result = null;
        Collections.min(flights);
        for (int i = 0; i < flights.size(); i++){
            if (flights.get(i).getFlightState().equals(FlightState.DEPARTURE)){
                result = flights.get(i);
            }
        }
        return result;
    }
    public boolean isDepartureMoreThanArrival(){
        int departure = 0;
        int arrival = 0;
        for (Flight actual: flights){
            if (actual.getFlightState().equals(FlightState.DEPARTURE)){
                departure ++;
            }else{
                arrival++;
            }
        }
        return departure > arrival;
    }
}
