package week15d04;

import org.jetbrains.annotations.NotNull;

public class CovidCasesByWeek implements Comparable<CovidCasesByWeek> {
    private int week;
    private int cases;

    public int getWeek() {
        return week;
    }

    public int getCases() {
        return cases;
    }

    public CovidCasesByWeek(int week, int cases) {
        this.week = week;
        this.cases = cases;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public void setCases(int cases) {
        this.cases = cases;
    }

    @Override
    public String toString() {
        return "CovidCasesByWeek{" +
                "week=" + week +
                ", cases=" + cases +
                '}';
    }

    @Override
    public int compareTo(@NotNull CovidCasesByWeek o) {
        return o.cases - this.cases;
    }
}
