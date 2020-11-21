package introcontrol;

import java.util.Scanner;

public class BoatRental {
    public static void main(String[] args) {
        int groupNumber;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hány fős csoport érkezett?");
        groupNumber = scanner.nextInt();
        scanner.nextLine();
        if (groupNumber >= 8){
            System.out.println("Összes csónak foglalt és " + (groupNumber - 8) + " fő maradt a parton");
        }
        else {
            boolean isFivBoatFull, isTwoBoatFull, isOneBoatFull;
            int restOfGroup;
            isOneBoatFull = ((groupNumber == 1) || (groupNumber == 3) || (groupNumber == 6));
            isTwoBoatFull = ((groupNumber == 2) || (groupNumber == 3) || (groupNumber == 7));
            isFivBoatFull = ((groupNumber >3) && (groupNumber < 6));
            if (isOneBoatFull) {System.out.println("Az 1 személyes csónak használatban");}
                else System.out.println("Az 1 személyes csónak kiadható");
            if (isTwoBoatFull) {System.out.println("A 2 személyes csónak használatban");}
                else System.out.println("A 2 személyes csónak kiadható");
            if (isFivBoatFull) {System.out.println("Az 5 személyes csónak használatban");}
                else System.out.println("Az 5 személyes csónak kiadható");

        }

    }
}
