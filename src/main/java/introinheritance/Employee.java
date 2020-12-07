package introinheritance;

public class Employee extends Person {
    private int salary;

    public Employee(String name, String adress, int salary) {
        super(name, adress);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
