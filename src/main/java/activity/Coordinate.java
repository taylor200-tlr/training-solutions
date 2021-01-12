package activity;

public class Coordinate {
    private double latitude;
    private double longitude;
    private final String ERROR = "Nem megfelelő koordináta";

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public Coordinate(double latitude, double longitude) {
        if (latitude<-90 || latitude>90){
            throw new IllegalArgumentException(ERROR);
        }
        if (longitude < -180 || latitude>180){
            throw new IllegalArgumentException(ERROR);
        }
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
