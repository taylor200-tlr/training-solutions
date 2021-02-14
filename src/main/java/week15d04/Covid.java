package week15d04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Covid {
    private List<CovidCasesByWeek> covidCasesByWeek = new ArrayList<>();

    public List<CovidCasesByWeek> getCovidCasesByWeek() {
        return covidCasesByWeek;
    }

    public void readLines(BufferedReader reader) throws IOException {
        String line;
        while ((line = reader.readLine()) != null) {
            processLine(line);
        }
    }

    private void processLine(String line) {
        if (line.contains("Hungary")) {
            splitline(line);
        }
    }

    private void splitline(String line) {
        String[] processedLine = line.split(",");
        covidCasesByWeek.add(new CovidCasesByWeek(dateSplitter(processedLine[1]), Integer.parseInt(processedLine[2])));
    }

    private int dateSplitter(String date) {
        String[] result;
        result = date.split("-");
        return Integer.parseInt(result[1]);
    }


    public static void main(String[] args) {
        Path path = Path.of("data.csv");
        Covid covid = new Covid();
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            covid.readLines(reader);
            Collections.sort(covid.covidCasesByWeek);
            for (int i = 0; i < 3; i++){
                System.out.println(covid.covidCasesByWeek.get(i));
            }

        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }
}
