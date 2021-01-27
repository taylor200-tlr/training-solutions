package week04d03;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        boolean isGuessed = false;
        System.out.println("Gondoltam egy számra, találd ki!");
        int randomNum = (int)(Math.random() * 100 + 1);
        System.out.println(randomNum);
        Scanner scanner = new Scanner(System.in);
        while (!isGuessed) {
            System.out.println("Mi a tipped?");
            int numberTipp = scanner.nextInt();
            if (numberTipp > randomNum) {
                System.out.println("Kisebbre gondoltam");
            } else if (numberTipp < randomNum){
                System.out.println("Nagyobbra gondoltam");
            } else {
                System.out.println("Gratulálok, kitaláltad!");
                isGuessed = true;
            }
        }

    }
}
