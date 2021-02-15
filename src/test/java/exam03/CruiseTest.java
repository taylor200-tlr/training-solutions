package exam03;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CruiseTest {
    private Boat boat = new Boat("WetDreams", 5);

    private Cruise cruise = new Cruise(boat, LocalDate.of(2021, 1, 1), 100_000);

    @Test
    void bookPassenger() {
        cruise.bookPassenger(new Passenger("John Doe", CruiseClass.LUXURY));

        assertEquals(1, cruise.getPassengers().size());
        assertEquals("John Doe", cruise.getPassengers().get(0).getName());
    }

    @Test
    void getPriceForPassenger() {
        double price = cruise.getPriceForPassenger(new Passenger("John Doe", CruiseClass.LUXURY));
        assertEquals(300_000, price, 0.5);

        price = cruise.getPriceForPassenger(new Passenger("John Doe", CruiseClass.FIRST));
        assertEquals(180_000, price, 0.5);

        price = cruise.getPriceForPassenger(new Passenger("John Doe", CruiseClass.SECOND));
        assertEquals(100_000, price, 0.5);
    }

    @Test
    void findPassengerByName() {
    }

    @Test
    void getPassengerNamesOrdered() {
    }

    @Test
    void sumAllBookingsCharged() {
    }

    @Test
    void countPassengerByClass() {
    }
}