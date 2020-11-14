package controlselection.month;

public class DayInMonth {
    private int year;
    private String month;

    public int howManyDaysInMonth(int year, String month){
        String upperedMonth = month.toUpperCase();
        int days = 0;
        switch (upperedMonth){
            case "FEBRUÁR":
                //gondolom itt a year változót fel kellene használni a szökőév meghatározásához
                days = 28;
                break;
            case "ÁPRILIS":
            case "JÚNIUS":
            case "SZEPTEMBER":
            case "NOVEMBER":
                days = 30;
                break;
            case "JANUÁR":
            case "MÁRCIUS":
            case "MÁJUS":
            case "JÚLIUS":
            case "AUGUSZTUS":
            case "OKTÓBER":
            case "DECEMBER":
                days = 31;
                break;
            default:
                throw new IllegalArgumentException("Ismeretlen hónap: " + upperedMonth);
        }
        return days;
    }

    public static void main(String[] args) {
        DayInMonth dayInMonth = new DayInMonth();
        System.out.println(dayInMonth.howManyDaysInMonth(2020, "Január"));
        System.out.println(dayInMonth.howManyDaysInMonth(2020, "február"));
        System.out.println(dayInMonth.howManyDaysInMonth(2020, "JúNiUs"));
        System.out.println(dayInMonth.howManyDaysInMonth(2020, "oktober"));
    }

}
