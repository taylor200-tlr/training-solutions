package classstructureio;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Össze fogok adni 2 számot, add meg az elsőt:");
        int number1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Most add meg a 2.-at:");
        int number2 = scanner.nextInt();

        Calculator calculator = new Calculator(number1, number2);
        System.out.println("" + number1 + " + " + number2);
        System.out.println("(" + calculator.addition(number1, number2) + ")");
        int[][] i = new int[3][3];
        System.out.println(i[2][2]);
    }
}
