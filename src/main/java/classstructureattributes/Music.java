package classstructureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Song dal = new Song();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kedvenc előadód:");
        dal.band = scanner.nextLine();
        System.out.println("Kedvenc dalod tőle:");
        dal.title = scanner.nextLine();
        System.out.println("Kedvenc dalod hossza");
        dal.length = scanner.nextLine();

        System.out.println(dal.band + " - " + dal.title +
                " (" + dal.length + ")");
    }
}
