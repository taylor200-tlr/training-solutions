package week02d02;

import java.util.Scanner;

public class Phone {
    private String type;
    private int mem;

    public Phone(String type, int mem) {
        this.type = type;
        this.mem = mem;
    }
    public String getType() {
        return type;
    }

    public int getMem() {
        return mem;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMem(int mem) {
        this.mem = mem;
    }

    public static void main(String[] args) {
        Phone telefon1 = new Phone("Nokia", 3310);
        Phone telefon2 = new Phone("iPhone", 12);
        System.out.println(telefon1.type + " - " + telefon1.mem);
        System.out.println(telefon2.type + " - " + telefon2.mem);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add meg a telefonod gyártóját");
        telefon1.type = scanner.nextLine();
        System.out.println("Add meg a másik telefonod gyártóját");
        telefon2.type = scanner.nextLine();
        System.out.println("Első telefonod típusa:");
        telefon1.mem = scanner.nextInt();
        System.out.println("Második telefonod típusa:");
        telefon2.mem = scanner.nextInt();
        System.out.println(telefon1.type + " - " + telefon1.mem);
        System.out.println(telefon2.type + " - " + telefon2.mem);


    }
}
