package circle;

import java.util.Scanner;

public class CircleMain {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Add meg az első kör átmérőjét:");
            Circle circle = new Circle(scanner.nextInt());
            scanner.nextLine();
            System.out.println("A kör kerülete: " + circle.perimeter());
            System.out.println("A kör területe: " + circle.area());
    }
}
