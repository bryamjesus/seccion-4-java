package Tarea;

import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double[] a = new double[7];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese numero: ");

            try {
                a[i] = s.nextInt();
            } catch (Exception e) {
                System.out.println();
                System.err.println(e);
                main(args);
            }
        }

        double promedioPosi = 0, promedioNega = 0;
        int contCero = 0, contPosi = 0, contNega = 0;

        bucle:
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                contCero++;
                continue bucle;
            }

            if (a[i] > 0) {
                promedioPosi += a[i];
                contPosi++;
                continue bucle;
            }

            if (a[i] < 0) {
                contNega++;
                promedioNega += a[i];
                continue bucle;
            }
        }
        promedioPosi = contPosi == 0 ? promedioPosi : promedioPosi / contPosi;
        promedioNega = contNega == 0 ? promedioNega : promedioNega / contNega;

        System.out.println("promedioPosi = " + promedioPosi);
        System.out.println("promedioNega = " + promedioNega);
        System.out.println("contCero = " + contCero);
    }
}
