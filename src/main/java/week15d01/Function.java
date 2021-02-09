package week15d01;

import java.util.Map;

public class Function {

    public Map.Entry<Integer, Integer> getMaxValueEntry(Map<Integer, Integer> graph) {
        Map.Entry<Integer, Integer> result = null;
        for (Map.Entry<Integer, Integer> actual: graph.entrySet()){
            if (result == null || result.getValue() < actual.getValue()){
                result = actual;
            }
        }
        return result;
    }
}
