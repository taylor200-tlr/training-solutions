package enumtype.week;

import java.util.ArrayList;
import java.util.List;

public class WorkdayCalculator {

    public Day nextDay(Day day){
        if (day.ordinal() == Day.values().length - 1){
            return Day.values()[0];
        } else {
            return Day.values()[day.ordinal() + 1];
        }
    }

    public List<DayType> dayTypes(Day firstDay, int numberOfDays) {
        List<DayType> types = new ArrayList<>();
        Day nap = firstDay;
        for (Day i: Day.values() ){
            types.add(nap.getDayType());
            nap = nextDay(nap);
        }
        return types;
    }

    public static void main(String[] args) {
        System.out.println(new WorkdayCalculator().dayTypes(Day.FRIDAY, 7));
        int x = 5;
        int y = 2;
        int z = x++ + (x - 4) * y - 2;
        System.out.println(x + " " + z);
        System.out.println(x);
        System.out.println(z);
    }
}
