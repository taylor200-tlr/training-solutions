package array;

import java.util.Scanner;

public class ArrayMain {
    public static void main(String[] args) {
        int[] a = new int[3];
        int[] b = {1, 7, 3, 4, 8, 6};
        int arraySize;
        a[0] = 1;
        System.out.println(a[0]);
        System.out.println(a[1]);

        System.out.println(a.length);
        System.out.println(b.length);
        System.out.println();

        for (int i=0; i<b.length; i++){
            System.out.println(b[i]);
        }
        System.out.println("Hány elemű legyen a tömb?");
        Scanner scanner = new Scanner(System.in);
        arraySize = scanner.nextInt();
        int[] c = new int[arraySize];
        for (int i: c){
            System.out.println(i +". elem értéke legyen:");
            c[i] = scanner.nextInt();
        }
        System.out.println();
        for (int k: c) {
            System.out.println(c[k]);
        }
    }
}
