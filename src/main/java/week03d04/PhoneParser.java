package week03d04;

public class PhoneParser {
    public Phone parse(String s){
        String prefix = s.substring(0, 2);
        String number = s.substring(3, s.length());
        Phone phone = new Phone(prefix, number);
        return phone;

//   vagy   return new Phone(s.substring(0, 2), s.substring(3));

    }

    public static void main(String[] args) {
        String s = "70-1234567";
        PhoneParser parser = new PhoneParser();
        Phone phone = parser.parse(s);
        System.out.println(phone);
        System.out.println(phone.getPrefix() + " " + phone.getNumber());
    }
}
