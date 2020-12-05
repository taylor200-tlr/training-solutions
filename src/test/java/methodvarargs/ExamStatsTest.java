package methodvarargs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExamStatsTest {
    @Test
    public void testExamStats(){
        ExamStats examStats = new ExamStats(100);
        int[] exams = {100, 44, 50, 80, 80, 70};
        examStats.hasAnyFailed(60, exams);
        assertTrue(examStats.hasAnyFailed(60, exams));
        assertEquals(4, examStats.getNumberOfTopGrades(60, exams));
    }
}
