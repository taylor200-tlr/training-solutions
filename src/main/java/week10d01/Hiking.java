package week10d01;

import java.util.ArrayList;
import java.util.List;

public class Hiking {
    private List<GpsPos> gpsPos = new ArrayList<>();

    public double getPlusElevation(List<GpsPos> pos) {
        //List<Double> elevations = new ArrayList<>();
        double elevation = 0;
        for (int i = 0; i < pos.size() - 1; i++) {
            if (pos.get(i + 1).getZ() > pos.get(i).getZ()) {
                elevation += pos.get(i + 1).getZ() - pos.get(i).getZ();
                System.out.println(pos.get(i).getZ() + " " + pos.get(i + 1).getZ() + " " + elevation);
            }
        }
        return elevation;
    }

    public Hiking(List<GpsPos> gpsPos) {
        this.gpsPos = gpsPos;
    }
}
