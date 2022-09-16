package Tarea;

import java.util.Scanner;

public class NumberMax {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] a = new int[7];
        int max = 0;

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese numero: ");
            try {
                int num = s.nextInt();

                if (num < 11 || num > 99) {

                    System.err.println("Numero en el rango equivocado");
                    System.out.println("Ingrese de nuevo los numeros");
                    main(args);
                    // System.exit(-1);
                }

                a[i] = num;
                max = i == 0 ? num : max;
                max = num > max ? num : max;

            } catch (Exception e) {
                System.out.println();
                System.err.println(e);
                System.out.println();
                main(args);
            }
        }

        System.out.println();
        for (int x : a) {
            System.out.print(x + " ");
        }

        System.out.println("\nEl numero maximo es = " + max);
    }
}
