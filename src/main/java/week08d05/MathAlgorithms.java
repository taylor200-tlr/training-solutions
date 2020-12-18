package week08d05;

public class MathAlgorithms {
    private int number1, number2;

    public static int greatestCommonDivisor(int number1, int number2) {
        int result = 0;

        for (int i = 1; i <= number1 && i <= number2; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                result = i;
            }
        }
        return result;
    }
}
