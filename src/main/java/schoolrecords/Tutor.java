package schoolrecords;

import java.util.List;

public class Tutor {
    private String name;
    private List<Subject> taughtSubjects;

    public String getName() {
        return name;
    }

    public Tutor(String name, List<Subject> taughtSubjects) {
        this.name = name;
        this.taughtSubjects = taughtSubjects;
    }

    public boolean tutorTeachingSubject(Subject subject){
        return false;
    }
}
