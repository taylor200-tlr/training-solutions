package methodvarargs;

public class ExamStats {
    private int maxPoint;
    private int limitInPoints;

    public ExamStats(int maxPoints) {
        maxPoint = maxPoints;
    }

    public int getNumberOfTopGrades(int limitInPercent, int... results) {
        int result = 0;
        int limitInPoints = (maxPoint * limitInPercent) / 100;
        for (int i : results) {
            if (limitInPercent < i) {
                result++;
            }
        }
        return result;
    }

    public boolean hasAnyFailed(int limitInPercent, int... results) {
        int limitinPoints = (maxPoint * limitInPercent) / 100;
        for (int i: results){
            if (limitInPercent > i){
                return true;
            }
        }
        return false;
    }
}
