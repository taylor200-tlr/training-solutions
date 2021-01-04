package week10d01;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HikingTest {
    @Test
    public void testHiking(){
        List<GpsPos> gpsPos = new ArrayList<>();
        GpsPos gpsPos1 = new GpsPos(1, 1, 1);
        GpsPos gpsPos2 = new GpsPos(1, 1, 8);
        GpsPos gpsPos3 = new GpsPos(1, 1, 2);
        GpsPos gpsPos4 = new GpsPos(1, 1, 6);
        GpsPos gpsPos5 = new GpsPos(1, 1, 10);
        GpsPos gpsPos6 = new GpsPos(1, 1, 1);
        gpsPos.add(gpsPos1);
        gpsPos.add(gpsPos2);
        gpsPos.add(gpsPos3);
        gpsPos.add(gpsPos4);
        gpsPos.add(gpsPos5);
        gpsPos.add(gpsPos6);
        Hiking hiking = new Hiking(gpsPos);
        assertEquals(15, hiking.getPlusElevation(gpsPos));
    }

}