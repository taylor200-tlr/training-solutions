package activity;

import java.util.ArrayList;
import java.util.List;

public class Track {
    List<TrackPoint> trackPoints = new ArrayList<>();

    public List<TrackPoint> getTrackPoints() {
        return trackPoints;
    }

    public void addTrackPoint(TrackPoint trackPoint) {
        trackPoints.add(trackPoint);
    }

    public Coordinate findMaximumCoordinate() {
        Coordinate result = new Coordinate();

        return result;
    }

    public Coordinate findMinimumCoordinate() {
        Coordinate result = new Coordinate();

        return result;
    }

    public double getDistance() {

        return 0.0;
    }

    public double getFullDecrease() {

        return 0.0;
    }

    public double getFullElevation() {

        return 0.0;
    }

    public double getRectangleArea() {

        return 0.0;
    }
}
