package week14d03;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Student implements Comparable<Student> {
    private String name;
    private Map<String, List<Integer>> marks = new HashMap<>();

    public Student(String name) {
        this.name = name;
    }

    public void gradeStudent(String subject, int mark){
        if (!marks.containsKey(subject)) {
            marks.put(subject, new ArrayList<>());
        }
        marks.get(subject).add(mark);
    }

    @Override
    public int compareTo(@NotNull Student o) {
        return name.compareTo(o.name);
    }
}
