package training;

public class TrainerMain {

    public static void main(String[] args) {
        Trainer trainer = new Trainer("John Doe", 1980);
        Trainer anotherTrainer = new Trainer("Jack Doe", 1974);

        System.out.println(trainer.getName());
        System.out.println(trainer.getYearOfBirth());
        System.out.println(anotherTrainer.getName());
        System.out.println(anotherTrainer.getYearOfBirth());

    }
}
