package introdate;

import java.time.LocalDate;

public class Employee {
    private String name;
    private LocalDate dateOfBirth, beginEmployment;

    public Employee(String name, LocalDate dateOfBirth, LocalDate beginEmployment) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.beginEmployment = beginEmployment;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public LocalDate getBeginEmployment() {
        return beginEmployment;
    }

    public void setName(String name) {
        this.name = name;
    }
}
