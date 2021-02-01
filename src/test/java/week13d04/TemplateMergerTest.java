package week13d04;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TemplateMergerTest {

    @Test
    void merge() {
        List<Employee> employees = Arrays.asList(
                new Employee("John Doe", 1984),
                new Employee("Jane Doe", 1990),
                new Employee("Jack Doe", 1980)
        );
        Path path = Path.of("employeesformat1.txt");
        Path path2 = Path.of("employeesformat2.txt");

        TemplateMerger templateMerger = new TemplateMerger();

        System.out.println(templateMerger.merge(path, employees));
        System.out.println(templateMerger.merge(path2, employees));
    }
}