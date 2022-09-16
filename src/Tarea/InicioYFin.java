package Tarea;

import java.util.Scanner;

public class InicioYFin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[10];
        int longitud = a.length - 1;

        for (int i = 0; i <= longitud; i++) {
            System.out.print("Ingrese numero: ");
            a[i] = s.nextInt();
        }

        for (int i = 0; i <= longitud - i; i++) {
            System.out.println(a[longitud - i]);
            System.out.println(a[i]);
        }
    }
}
