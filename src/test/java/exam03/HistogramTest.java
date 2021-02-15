//package exam03;
//
//import org.junit.jupiter.api.Test;
//
//import java.nio.file.Path;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class HistogramTest {
//    Histogram histogram = new Histogram();
//
//    @Test
//    void createHistogram() {
//        histogram.readLine(Path.of("histogram.txt"));
//    }
//}

package exam03;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HistogramTest {

    @Test
    void createHistogram() throws IOException {
//        try (BufferedReader reader = new BufferedReader(new InputStreamReader(HistogramTest.class.getResourceAsStream("histogram.txt")))) {
        try (BufferedReader reader = Files.newBufferedReader(Path.of("histogram.txt"))) {
            String result = new Histogram().createHistogram(reader);
//            System.out.println(result);
            assertEquals("***\n" +
                    "****\n" +
                    "**\n" +
                    "*\n", result);
        }
    }
}