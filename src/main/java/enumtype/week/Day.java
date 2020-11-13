package enumtype.week;

public enum Day {
    MONDAY(DayType.WORKDAY), TUESDAY(DayType.WORKDAY), WEDNESDAY(DayType.WORKDAY), THURSDAY(DayType.WORKDAY), FRIDAY(DayType.WORKDAY), SATURDAY(DayType.HOLYDAY), SUNDAY(DayType.HOLYDAY);

    private final DayType dayType;

    Day(DayType dayType) {
        this.dayType = dayType;
    }

    public DayType getDayType() {
        return dayType;
    }
}
