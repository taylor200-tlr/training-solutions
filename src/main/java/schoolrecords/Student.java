package schoolrecords;

import java.util.List;

public class Student {
    private String name;
    private List<Mark> marks;

    public String getName() {
        return name;
    }
    public double calculateAverage(){
        double result = 0;

        return result;
    }
    public double calculateSubjectAverage(Subject subject){
        double result = 0;

        return result;
    }
    public void grading(Mark mark){

    }
    public boolean isEmpty(String text){
        return false;
    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
