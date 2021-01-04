package schoolrecords;

import java.util.List;

public class Student {
    private String name;
    private List<Mark> marks;

    public String getName() {
        return name;
    }

    public double calculateAverage() {
        double average = 0.0;
        if (marks.size() == 0){
            return average;
        }else {
            for (Mark i : marks) {
                average += i.getMarkType().getValue();
            }
            return average / marks.size();
        }
    }

    public double calculateSubjectAverage(Subject subject) {
        double average = 0.0;
        int markNumber = 0;
        for (Mark i : marks) {
            if (i.getSubject().equals(subject.getSubjectName())) {
                average += i.getMarkType().getValue();
                markNumber++;
            }
        }
        if (markNumber == 0) {
            return markNumber;
        } else {
            return average / markNumber;
        }
    }

    public void grading(Mark mark) {
        if (mark == null){
            throw new NullPointerException("Mark must not be null!");
        }
        marks.add(mark);
    }

    public boolean isEmpty(String text) {
        if (text.isBlank() || text == null) {
            return true;
        } else return false;
    }

    public Student(String name) {
        this.name = name;
    }


/* Amit én csináltam, de nem jó
    @Override
    public String toString() {
        String result = "";
        for (Mark i : marks) {
            result += " marks" + i.getSubject().getSubjectName() + ": " + i.toString();
        }
        return result;
    }

 */
//StringBuilderrel, mert ciklusban inkább ezt kellene használni stringek összefűzésére:
@Override
public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(name + " marks: ");
    for (Mark i: marks) {
        stringBuilder.append(i.getSubject().getSubjectName()).append(": ").append(i.toString());
    }
    return stringBuilder.toString();
}
}
