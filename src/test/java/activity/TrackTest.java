package activity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrackTest {
    public Track track = new Track();

    @Test
    void getTrackPoints() {
    }

    @Test
    void addTrackPoint() {
        assertEquals(0, track.getTrackPoints().size());
        track.addTrackPoint(new TrackPoint(new Coordinate(12.5, 34.89), 123));
        assertEquals(1, track.getTrackPoints().size());
        assertEquals(34.89, track.getTrackPoints().get(0).getCoordinate().getLongitude());
    }

    @Test
    void findMaximumCoordinate() {
        track.addTrackPoint(new TrackPoint(new Coordinate(12.5, 34.89), 123));
        track.addTrackPoint(new TrackPoint(new Coordinate(-12.5, 45.7), 124));
        track.addTrackPoint(new TrackPoint(new Coordinate(13.7, -6.0), 0));
        track.addTrackPoint(new TrackPoint(new Coordinate(3.67, -42.789), 200));

        assertEquals(13.7, track.findMaximumCoordinate().getLatitude());
        assertEquals(45.7, track.findMaximumCoordinate().getLongitude());
    }

    @Test
    void findMinimumCoordinate() {
        track.addTrackPoint(new TrackPoint(new Coordinate(12.5, 34.89), 123));
        track.addTrackPoint(new TrackPoint(new Coordinate(-12.5, 45.7), 124));
        track.addTrackPoint(new TrackPoint(new Coordinate(13.7, -6.0), 0));
        track.addTrackPoint(new TrackPoint(new Coordinate(3.67, -42.789), 200));

        assertEquals(-42.789, track.findMinimumCoordinate().getLongitude());
        assertEquals(-12.5, track.findMinimumCoordinate().getLatitude());

    }

    @Test
    void getDistance() {
        track.addTrackPoint(new TrackPoint(new Coordinate(12.5, 34.89), 123));
        track.addTrackPoint(new TrackPoint(new Coordinate(-12.5, 45.7), 124));
        track.addTrackPoint(new TrackPoint(new Coordinate(13.7, -6.0), 0));
        track.addTrackPoint(new TrackPoint(new Coordinate(3.67, -42.789), 200));

        assertTrue(track.getDistance() > 13611579.56 && track.getDistance() < 13611579.66);
    }

    @Test
    void getFullDecrease() {
        track.addTrackPoint(new TrackPoint(new Coordinate(12.5, 34.89), 123));
        track.addTrackPoint(new TrackPoint(new Coordinate(12.5, 34.89), 124));
        track.addTrackPoint(new TrackPoint(new Coordinate(12.5, 34.89), 0));
        track.addTrackPoint(new TrackPoint(new Coordinate(12.5, 34.89), 200));

        assertEquals(124.0, track.getFullDecrease());
    }

    @Test
    void getFullElevation() {
        track.addTrackPoint(new TrackPoint(new Coordinate(12.5, 34.89), 123));
        track.addTrackPoint(new TrackPoint(new Coordinate(12.5, 34.89), 124));
        track.addTrackPoint(new TrackPoint(new Coordinate(12.5, 34.89), 0));
        track.addTrackPoint(new TrackPoint(new Coordinate(12.5, 34.89), 200));

        assertEquals(201.0, track.getFullElevation());
    }

    @Test
    void getRectangleArea() {
        track.addTrackPoint(new TrackPoint(new Coordinate(12.5, 34.89), 123));
        track.addTrackPoint(new TrackPoint(new Coordinate(-12.5, 45.7), 124));
        track.addTrackPoint(new TrackPoint(new Coordinate(13.7, -6.0), 0));
        track.addTrackPoint(new TrackPoint(new Coordinate(3.67, -42.789), 200));

        assertEquals(2318.4118, track.getRectangleArea());
    }
}