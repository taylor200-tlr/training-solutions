package a1vizsgacheatsheet;

import java.util.*;

public class MapTest {

    private Map<String, Integer> maptest = new HashMap<>();

    @Override
    public String toString() {
        return "MapTest{" +
                "maptest=" + maptest +
                '}';
    }

    public static void main(String[] args) {
        MapTest mapTest = new MapTest();
        mapTest.maptest.put("a1", 1);
        mapTest.maptest.put("a2", 2);
        mapTest.maptest.put("a3", 3);
        mapTest.maptest.put("a4", 4);
        mapTest.maptest.put("a5", 5);

        for (Map.Entry actual : mapTest.maptest.entrySet()) {
            System.out.println(actual);
            actual.setValue(12);
            System.out.println(actual.getValue());
            System.out.println(actual.getKey());
        }
    }
}
