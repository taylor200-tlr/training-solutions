package week02;

import java.util.Scanner;

public class InputNames {
    public static void main(String[] args) {
        String [] nevek = new String[5];
        Scanner scanner = new Scanner(System.in);

        for (int i=0; i < nevek.length; i++){
            System.out.println("Add meg a(z) " + (i+1) + ". nevet:");
            nevek[i] = scanner.nextLine();
        }
        for (int j=0; j < nevek.length; j++){
            System.out.println((j+1) + ". elem: " + nevek[j]);
        }
    }

}
