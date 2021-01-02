package schoolrecords;

public class StudyResultByName {
    private double studyAverage;
    private String studentName;

    public StudyResultByName(double studyAverage, String studentName) {
        this.studentName = studentName;
        this.studyAverage = studyAverage;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getStudyAverage() {
        return studyAverage;
    }
}
