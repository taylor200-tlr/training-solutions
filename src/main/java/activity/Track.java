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
        Coordinate result = new Coordinate(0, 0);

        return result;
    }

    public Coordinate findMinimumCoordinate() {
        Coordinate result = new Coordinate(0, 0);

        return result;
    }

    public double getDistance() {
        double distance = 0.0;
        if (trackPoints.size() < 2) {
            return distance;
        }
        for (int i = 1; i < trackPoints.size(); i++) {
            distance += trackPoints.get(i).getDistanceFrom(trackPoints.get(i-1));
        }
        return distance;
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
