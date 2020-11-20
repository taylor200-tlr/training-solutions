package stringconcat;

public class Employee {
    private String name, job;
    private int salary;

    public Employee(String name, String job, int salary) {
        if (name == null || name.equals("")){
            throw new IllegalArgumentException("Name must not be empty.");
        }
        this.name = name;
        if (job == null || job.equals("")){
            throw new IllegalArgumentException("Job must not be empty.");
        }
        this.job = job;
        if (salary < 0){
            throw new IllegalArgumentException("Salary must be positive.");
        }
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " - " + job + " - " + salary + " Ft";
    }
}
