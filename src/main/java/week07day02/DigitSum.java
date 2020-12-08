package week07day02;

public class DigitSum {
    public int sumOfDigits(int number) {
        int result = 0;
        for (int i = 0; i <= Math.abs(number); i++){
            result = result + i;
        }
        if (number < 0){
            result = 0 - result;
        }
        return result;
    }
    public boolean isNegative(int number){
        return number < 0;
    }
}
