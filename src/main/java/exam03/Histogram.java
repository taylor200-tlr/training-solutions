package exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Histogram {

// Első nekifutás
//    private Path path = Path.of("histogram.txt");
//
//    public void readLine(Path path) {
//        String line;
//        try (BufferedReader reader = Files.newBufferedReader(path)) {
//            while ((line = reader.readLine()) != null) {
//                createHistogram(line);
//            }
//        } catch (IOException ioe) {
//            throw new IllegalStateException("Can not read file!", ioe);
//        }
//    }
//
//    public void createHistogram(String line) {
//        int result = Integer.parseInt(line);
//        for (int i = 0; i < result; i++) {
//            System.out.print('*');
//        }
//        System.out.print("" + "\n");
//    }

// Második nekifutás StringBuilderrel

    public String createHistogram(BufferedReader reader) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        String result = "";
        String line;
        int numberInLine;
        while ((line = reader.readLine()) != null) {
//            System.out.println(line);
            numberInLine = Integer.parseInt(line);
            result = drawHistogram(numberInLine, '*');
            stringBuilder.append(result);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    private String drawHistogram(int numberInLine, char c) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < numberInLine; i++) {
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        try (BufferedReader reader = Files.newBufferedReader(Path.of("histogram.txt"))) {
            System.out.println(new Histogram().createHistogram(reader));
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

}
