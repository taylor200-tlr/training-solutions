package ioprintwriter;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SalaryWriter {
    private List<String> names;

    public SalaryWriter(List<String> names) {
        this.names = names;
    }

    public void writeNamesAndSalaries(Path path) {
        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(path))) {
            for (String name : names) {
                if (name.contains("Dr")) {
                    writer.print(name);
                    writer.print(", ");
                    writer.println(500_000);
                } else if (name.contains("Mr") || name.contains("Mrs")) {
                    writer.print(name);
                    writer.print(", ");
                    writer.println(200_000);
                } else {
                    writer.print(name);
                    writer.print(", ");
                    writer.println(100_000);
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file!", ioe);
        }
    }
}
