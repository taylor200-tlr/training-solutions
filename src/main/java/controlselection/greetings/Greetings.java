package controlselection.greetings;

public class Greetings {
    private int hour, min;

    public String greeting(int hour, int min){
        if (hour > 4 && hour < 9){
            return "Jó reggelt";
        }else if (hour < 19 && min < 31){
            return "Jó napot";
        }else if (hour < 21){
            return "Jó estét";
        }
        return "Jó éjszakát";
    }

    public static void main(String[] args) {
        Greetings greetings = new Greetings();
        System.out.println(greetings.greeting(19, 25));
        System.out.print("    Hexo   World    ".trim().replace("x", "ll").substring(2, 10));
    }
}
