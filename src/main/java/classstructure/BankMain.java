package classstructure;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add meg a számlaszámod:");
        String accountNumber = scanner.nextLine();
        System.out.println("Add meg a számlához tartozó nevet:");
        String owner = scanner.nextLine();
        System.out.println("Add meg az egyenleged");
        int balance = scanner.nextInt();
        BankAccount account1 = new BankAccount(accountNumber, owner, balance);
        System.out.println(account1.getInfo());



    }
}
