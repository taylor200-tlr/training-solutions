package exam03retake01;

public class CdvCheck {
    public boolean check(String taxNumber) {
        int sum = 0;
        int number = 0;
        char[] numbers;
        int remain;

        if (taxNumber.length() != 10) {
            throw new IllegalArgumentException("Wrong number");
        }
//        for(int i=0;i<taxNumber.length();i++){
//            if(!taxNumber.charAt(i).isDigit){
//                throw new IllegalArgumentException("Wrong Number");
//            }
//        }
        numbers = taxNumber.toCharArray();
        for (int i = 0; i < taxNumber.length() - 1; i++) {
            number = (i + 1) * Integer.parseInt(taxNumber.substring(i, i + 1));
            sum += number;
            System.out.println(number);
            System.out.println(sum);
        }
        return (Integer.parseInt(taxNumber.substring(9, 10)) == sum % 11);
    }
}
