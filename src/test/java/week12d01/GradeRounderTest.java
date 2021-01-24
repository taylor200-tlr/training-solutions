package week12d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradeRounderTest {
    int[] grades = {30, 31, 41, 60, 84, 90, 12, 89};
    GradeRounder gradeRounder = new GradeRounder();
    @Test
    void roundGrades() {
        int[] roundedGrades = gradeRounder.roundGrades(grades);

        assertEquals(roundedGrades[0], 30);
        assertEquals(roundedGrades[1], 31);
        assertEquals(roundedGrades[2], 41);
        assertEquals(roundedGrades[3], 60);
        assertEquals(roundedGrades[4], 85);
        assertEquals(roundedGrades[5], 90);
        assertEquals(roundedGrades[6], 12);
        assertEquals(roundedGrades[7], 90);
    }
}