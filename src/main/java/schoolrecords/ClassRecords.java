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
        double result = 0;

        return result;
    }

    public ClassRecords(String className, Random rnd) {
        this.className = className;
        this.rnd = rnd;
    }
    public Student findStudentByName(String student){
        Student result = new Student("Tanuló");

        return result;
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
