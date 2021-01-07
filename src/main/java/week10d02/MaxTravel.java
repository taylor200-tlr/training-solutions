package week10d02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxTravel {
    public static int getMaxIndex(List<Integer> stops) {
        int result = 0;
        int maxStop = 0;
        List<Integer> stations = new ArrayList<>();
        for (int i : stops) {
            if (!stations.contains(i)) {
                stations.add(i);
            }
        }
        for (int j : stations) {
            for (int k : stops) {
                if (j == k) {
                    maxStop++;
                }
            }
            if (result < maxStop) {
                result = maxStop;
                maxStop = 0;
            }
        }
        return result - 1;
    }
}
