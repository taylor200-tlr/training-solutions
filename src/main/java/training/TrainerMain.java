package training;

import java.util.Scanner;

public class TrainerMain {

    public static void main(String[] args) {
        System.out.println("Mi a neved?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine() ;

        System.out.println("Mikor születtél?");
        int yearOfBirth = scanner.nextInt();

        Trainer trainer = new Trainer(name, yearOfBirth);
        System.out.println(trainer.getNameAndYearOfBirth());

    }
}
