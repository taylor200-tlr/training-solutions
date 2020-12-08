package week07d01;

class MathAlgorithms {
    public boolean isPrime(int number) {
        int remainder = 0;
        if (number < 0) {
            throw new IllegalArgumentException("Nem pozitív szám");
        }
        for (int i = 1; i <= number; i++) {
            if ((number % i) == 0) {
                remainder++;
                if (remainder > 2) {
                    return false;
                }
            }
        }
        return true;
    }

}