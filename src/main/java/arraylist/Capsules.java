package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {
    private List<String> capsules = new ArrayList<>();

    public void addFirst(String color){
        capsules.add(0,color);
    }
    public void addLast(String color){
        capsules.add(capsules.size() - 1, color);
    }
    public void removeFirst(){
        capsules.remove(0);
    }
    public void removeLast(){
        capsules.remove(capsules.size() - 1);
    }
    public void getColors(){
        for (String i: capsules){
            System.out.println(i);
        }
    }

    @Override
    public String toString() {
        return "" + capsules;
    }
}
