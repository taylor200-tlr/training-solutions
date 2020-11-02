package stringtype;

public class stringTypeMain {
    public static void main(String[] args) {
        String prefix = "Hello ";
        String name = "John Doe";
        String message = prefix + name;
        message = message + 444;

        boolean b = message.equals("Hello John Doe");
        System.out.println(b);

        boolean c = message.equals("Hello John Doe444");
        System.out.println(c);

        String strin1 =""; String strin2 =""; String stringkonk = strin1 + strin2;
        System.out.println(stringkonk.length());

        String string3 = "Abcde";
        System.out.println(string3.length());
        System.out.println(string3.substring(0, 1) + ", " + string3.substring(2, 3));
        System.out.println(string3.substring(0, 3));


    }
}
