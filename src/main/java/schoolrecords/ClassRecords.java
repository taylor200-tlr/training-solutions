package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {
    private String className;
    private Random rnd;
    private List<Student> students;

    public boolean addStudent(Student student) {
        return false;
    }

    public double calculateClassAverage() {
        double result = 0;
        for (Student i : students) {
            result += i.calculateAverage();
        }
        if (students.size() == 0) {
            return result;
        } else {
            return result / students.size();
        }
    }

    public double calculateClassAverageBySubject(Subject subject) {
        if (students.size() == 0) {
            throw new IllegalArgumentException("Nincsenek tanulók a naplóban");
        }
        double result = 0;
        for (Student i : students) {
            result += i.calculateSubjectAverage(subject);
        }
        return result / students.size();
    }

    public ClassRecords(String className, Random rnd) {
        this.className = className;
        this.rnd = rnd;
    }

    public Student findStudentByName(String student) {
        if (student == null || student.isBlank()) {
            throw new IllegalArgumentException("A tanuló nevét meg kell adni!");
        }
        if (students.size() == 0) {
            throw new IllegalArgumentException("Nincs tanuló a naplóban!");
        }
        for (Student i : students) {
            if (i.getName().equals(student)) {
                return i;
            }
        }
        throw new IllegalArgumentException(student + " nem található a naplóban.");
    }

    public String getClassName() {
        return className;
    }

    public boolean isEmpty(String text) {
        return (text.isBlank() || (text == null));
    }

    public String listStudentNames() {
        StringBuilder studentList = new StringBuilder();
        for (Student i : students) {
            studentList.append(i.getName() + ", ");
        }
        return studentList.toString();
    }

    public List<StudyResultByName> listStudyResults() {
        List<StudyResultByName> studyResultByNames = new ArrayList<>();
        for (Student i : students) {
            studyResultByNames.add(new StudyResultByName(i.calculateAverage(), i.getName()));
        }
        return studyResultByNames;
    }

    public boolean removeStudent(Student student) {
        if (students.contains(student)) {
            return students.remove(student);
        } else {
            return false;
        }
    }

    public Student repetition() {
        if (students.size() > 0) {
            return students.get(rnd.nextInt(students.size()));
        } else {
            throw new IllegalStateException("Nincs tanuló");
        }
    }
}
