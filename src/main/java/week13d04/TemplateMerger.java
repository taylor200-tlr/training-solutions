package week13d04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class TemplateMerger {

    public String merge(Path file, List<Employee> employees) {
        StringBuilder result = new StringBuilder();
        String firstResult;
        String secondResult;
        String format = getFormat(file);

        for (Employee employee : employees) {
            firstResult = format.replace("{nev}", employee.getName());
            secondResult = firstResult.replace("{ev}", Integer.toString(employee.getYearOfBirth()));
            result.append(secondResult + "\n");
        }
        return result.toString();
    }

    private String getFormat(Path path) {
        String result;
        try {
            result = Files.readString(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        return result;
    }
}
