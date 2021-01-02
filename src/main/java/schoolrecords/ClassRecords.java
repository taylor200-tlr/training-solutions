package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {
    private String className;
    private Random rnd;
    private List<Student> students;

    public boolean addStudent(Student student){
        return false;
    }
    public double calculateClassAverage(){
        double result = 0;

        return result;
    }
    public double calculateClassAverageBySubject(Subject subject){
        if (students.size() == 0){
            throw new IllegalArgumentException("Nincsenek tanulók a naplóban");
        }
        double result = 0;
        for (Mark i: )
        return result;
    }

    public ClassRecords(String className, Random rnd) {
        this.className = className;
        this.rnd = rnd;
    }
    public Student findStudentByName(String student){
        if (student == null || student.isBlank()){
            throw new IllegalArgumentException("A tanuló nevét meg kell adni!");
        }
        if (students.size() == 0){
            throw new IllegalArgumentException("Nincs tanuló a naplóban!");
        }
        for (Student i: students){
            if (i.getName().equals(student)){
                return i;
            }
        }
        throw new IllegalArgumentException(student + " nem található a naplóban.");
    }

    public String getClassName() {
        return className;
    }
    public boolean isEmpty(String text){

        return false;
    }
    public String listStudentNames(){
        return "";
    }
    public List<StudyResultByName> listStudyResults(){
        List<StudyResultByName> studyResultByNames = new ArrayList<>();

        return studyResultByNames;
    }
    public boolean removeStudent(Student student){
        return false;
    }
    public Student repetition(){
        if (students.size() > 0) {
            return students.get(rnd.nextInt(students.size()));
        } else {
            throw new IllegalStateException("Nincs tanuló");
        }
    }
}
