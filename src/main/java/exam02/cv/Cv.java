package exam02.cv;

import java.util.ArrayList;
import java.util.List;

public class Cv {
    private String name;
    private List<Skill> skills = new ArrayList<>();

    public Cv(String name) {
        this.name = name;
    }

    public Cv(String name, List<Skill> skills) {
        this.name = name;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public int findSkillLevelByName(String skillName){
        int result = 0;
        for(Skill i: skills){
            if(i.getName() == skillName){
                result = i.getLevel();
            }
        }
        return result;
    }
    public void addSkills(String skillName, int skillLevel){

    }
}
