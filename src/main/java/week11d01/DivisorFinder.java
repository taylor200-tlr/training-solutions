package week11d01;

public class DivisorFinder {
    public static int findDivisor(int n) {
        int result = 0;
        String number = "" + n;
        int divisor = 0;
        for (int i = 0; i < number.length(); i++){
            divisor = Character.getNumericValue(number.charAt(i));
            if (divisor > 0){
                if (n % divisor == 0){
                    result ++;
                }
            }

        }
        return result;
    }
}
