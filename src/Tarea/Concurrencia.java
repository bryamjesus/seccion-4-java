package Tarea;

import java.util.Scanner;

public class Concurrencia {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] a = new int[10];
        int[] nuevo = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese numero: ");
            a[i] = s.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            int cont = 0;
            for (int j = 0; j < nuevo.length; j++) {
                if (a[i] == a[j]) {
                    cont++;
                }
            }
            nuevo[i] = cont;
        }

        int max = 0, indice = 0;
        bucle:
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                max = nuevo[i];
                indice = i;
                continue;
            }

            if (max < nuevo[i]) {
                max = nuevo[i];
                indice = i;
            }
        }

        System.out.println("El mayor concurrencias es: " + max);
        System.out.println("El elemento que más se repite es: " + a[indice]);
    }
}
