package literals;

public class LiteralsMain {
    public static void main(String[] args) {
        double quotient = 3/4;
        System.out.println("" + 1 + 2);
        System.out.println("1" + "2");
        System.out.println(quotient);
        quotient = 3/4D;
        System.out.println(quotient);

        long big = 3_244_444_444L;

        String word;
        word = "title";
        word.toUpperCase();
        System.out.println(word);
        word = word.toUpperCase();
        System.out.println(word);

        int number1 = 1;
        int number2 = -2;
        System.out.println((Integer.toBinaryString(number1)));
        System.out.println((Integer.toString(number1, 2)));
        System.out.println((Integer.toBinaryString(number2)));
        System.out.println((Integer.toString(number2, 2)));

        System.out.println(new Integer(1) + new Integer(2));
    }

}
