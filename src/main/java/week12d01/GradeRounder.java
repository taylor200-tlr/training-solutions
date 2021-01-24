package week12d01;

public class GradeRounder {

    public int[] roundGrades(int[] grades) {
        int[] result = grades;
        int counter = 0;
        for (int i : grades) {
            if (i > 40) {
                if (((5 - (i % 5)) < 3) && ((i%5)>0)) {
                    result[counter] = i + (5 - (84 % 5));
                }
            }
            //System.out.println(grades[counter] + " - "+ result[counter]);
            counter++;
        }
        return result;
    }
}
