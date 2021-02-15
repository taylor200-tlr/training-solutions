package exam03;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class HistogramTest {
    Histogram histogram = new Histogram();

    @Test
    void createHistogram() {
        histogram.readLine(Path.of("histogram.txt"));
    }
}