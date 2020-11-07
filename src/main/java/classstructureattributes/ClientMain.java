package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Client ugyfel = new Client();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mi a neved?");
        ugyfel.name = scanner.nextLine();
        System.out.println("Mikor születtél?");
        ugyfel.yearOfBirth = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Hol laksz?");
        ugyfel.adress = scanner.nextLine();

        System.out.println(ugyfel.name + " " + ugyfel.yearOfBirth +
                " " + ugyfel.adress);

    }
}
