package controlselection.month;

public class DayInMonth {
    private int year;
    private String month;

    public int howManyDaysInMonth(int year, String month){
        String upperedMonth = month.toUpperCase();
        int days = 0;
        switch (upperedMonth){
            case "FEBRUÁR":
                if (((year % 100 == 0) && (year % 400 == 0)) || ((year % 4 == 0) && (year % 100 > 0))){
                days = 29;}
            else days = 28;
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
                throw new IllegalArgumentException("Ismeretlen hónap: " + month);
        }
        return days;
    }

    public static void main(String[] args) {
        DayInMonth dayInMonth = new DayInMonth();
        System.out.println(dayInMonth.howManyDaysInMonth(2020, "Január"));
        System.out.println(dayInMonth.howManyDaysInMonth(2019, "február"));
        System.out.println(dayInMonth.howManyDaysInMonth(2000, "február"));
        System.out.println(dayInMonth.howManyDaysInMonth(2100, "február"));
        System.out.println(dayInMonth.howManyDaysInMonth(2020, "JúNiUs"));
        System.out.println(dayInMonth.howManyDaysInMonth(2020, "oktober"));
    }

}
