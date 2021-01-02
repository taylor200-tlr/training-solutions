package schoolrecords;

import java.util.List;

public class Student {
    private String name;
    private List<Mark> marks;

    public String getName() {
        return name;
    }

    public double calculateAverage() {
        double result = 0;
        for (Mark i : marks) {
            result += i.getMarkType().getValue();
        }
        return result / marks.size();
    }

    public double calculateSubjectAverage(Subject subject) {
        double average = 0;
        for (Mark i : marks) {

        }
        return average;
    }

    public void grading(Mark mark) {
        marks.add(mark);
    }

    public boolean isEmpty(String text) {
        return false;
    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String result = "";
        for (Mark item : marks) {
            result += item.getSubject().getSubjectName() + ": " + item.toString();
        }
        return name + " marks: " + result;
    }
}
