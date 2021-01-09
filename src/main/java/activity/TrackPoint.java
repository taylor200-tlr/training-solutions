package activity;

public class TrackPoint {
    private Coordinate coordinate;
    private double elevation;

    public TrackPoint(Coordinate coordinate, double elevation) {
        this.coordinate = coordinate;
        this.elevation = elevation;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public double getElevation() {
        return elevation;
    }

    public double GetDistanceFrom(TrackPoint trackPoint){
        double result = 0.0;

        return result;
    }
}
