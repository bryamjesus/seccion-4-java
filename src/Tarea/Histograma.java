package Tarea;

import java.util.Scanner;

public class Histograma {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[12];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese numero: ");
            a[i] = s.nextInt();
        }

        for (int i = 0; i < 6; i++) {
            System.out.print((i + 1) + ": ");
            for (int j = 0; j < a.length; j++) {
                if ((i + 1) == a[j]) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
