package week14d03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClassNoteBook {
    private List<Student> studentNames;

    public ClassNoteBook(List<Student> studentNames) {
        this.studentNames = studentNames;
    }

    public List<Student> sortNoteBook(){
        List<Student> result = new ArrayList<>(studentNames);
        Collections.sort(result);
        return result;
    }

}
