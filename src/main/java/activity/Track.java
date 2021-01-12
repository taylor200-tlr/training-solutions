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
        return new Coordinate(getMaxLat(), getMaxLon());
    }

    public Coordinate findMinimumCoordinate() {
        return new Coordinate(getMinLat(), getMinLon());

    }

    public double getDistance() {
        double distance = 0.0;
        if (trackPoints.size() < 2) {
            return distance;
        }
        for (int i = 1; i < trackPoints.size(); i++) {
            distance += trackPoints.get(i).getDistanceFrom(trackPoints.get(i - 1));
        }
        return distance;
    }

    public double getFullDecrease() {
        double result = 0.0;
        for (int i = 0; i < trackPoints.size() - 1; i++) {
            if (trackPoints.get(i + 1).getElevation() < trackPoints.get(i).getElevation()) {
                result += trackPoints.get(i).getElevation() - trackPoints.get(i + 1).getElevation();
            }
        }
        return result;
    }

    public double getFullElevation() {
        double result = 0.0;
        for (int i = 0; i < trackPoints.size() - 1; i++) {
            if (trackPoints.get(i + 1).getElevation() > trackPoints.get(i).getElevation()) {
                result += trackPoints.get(i + 1).getElevation() - trackPoints.get(i).getElevation();
            }
        }
        return result;
    }

    public double getRectangleArea() {
        TrackPoint startPoint = new TrackPoint(new Coordinate(getMinLat(), getMaxLon()), 0);
        // Én így számoltam volna, de így nem fut le a teszteset
        //double xDistance = startPoint.getDistanceFrom(new TrackPoint(new Coordinate(getMaxLat(), getMaxLon()), 0));
        //double yDistance = startPoint.getDistanceFrom(new TrackPoint(new Coordinate(getMinLat(), getMinLon()), 0));
        double xDistance = getMaxLat() - getMinLat();
        double yDistance = getMaxLon() - getMinLon();
        return xDistance * yDistance;
    }

    private double getMaxLat() {
        double result = trackPoints.get(0).getCoordinate().getLatitude();
        for (int i = 0; i < trackPoints.size() - 1; i++) {
            if (trackPoints.get(i + 1).getCoordinate().getLatitude() > result) {
                result = trackPoints.get(i + 1).getCoordinate().getLatitude();
            }
        }
        return result;
    }

    private double getMaxLon() {
        double result = trackPoints.get(0).getCoordinate().getLongitude();
        for (int i = 0; i < trackPoints.size() - 1; i++) {
            if (trackPoints.get(i + 1).getCoordinate().getLongitude() > result) {
                result = trackPoints.get(i + 1).getCoordinate().getLongitude();
            }
        }
        return result;
    }

    private double getMinLat() {
        double result = trackPoints.get(0).getCoordinate().getLatitude();
        for (int i = 0; i < trackPoints.size() - 1; i++) {
            if (trackPoints.get(i + 1).getCoordinate().getLatitude() < result) {
                result = trackPoints.get(i + 1).getCoordinate().getLatitude();
            }
        }
        return result;
    }

    private double getMinLon() {
        double result = trackPoints.get(0).getCoordinate().getLongitude();
        for (int i = 0; i < trackPoints.size() - 1; i++) {
            if (trackPoints.get(i + 1).getCoordinate().getLongitude() < result) {
                result = trackPoints.get(i + 1).getCoordinate().getLongitude();
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Track{" +
                "trackPoints=" + trackPoints +
                '}';
    }

}
