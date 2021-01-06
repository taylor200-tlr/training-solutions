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
            if(i.getName().equals(skillName)){
                result = i.getLevel();
            }
        }
        return result;
    }
    public void addSkills(String... skill) {
        for (String i: skill){
        skills.add(getSkillFromString(i));
        }
        //skills.add(new Skill(hoppá....));
    }
    private Skill getSkillFromString(String skill){
        String skillName = "";
        int skillLevel = 0;
        skillName = skill.substring(0, skill.indexOf("(")-1);
        skillName.trim();
        skillLevel = Integer.parseInt(skill.substring(skill.indexOf("(")+1, skill.length()-1));
        //System.out.println(skillName + skillLevel);
        return new Skill(skillName, skillLevel);
    }
}
