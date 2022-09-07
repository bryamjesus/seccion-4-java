import java.util.Scanner;

public class NNImparPar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] a = {}, pares = {}, impares = {};
        int totalPares = 0, totalImpares = 0;

        a = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                totalPares++;
            } else {
                totalImpares++;
            }
        }

        pares = new int[totalPares];
        impares = new int[totalImpares];

        int auxPar = 0, auxImpar = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                pares[auxPar++] = a[i];
            } else {
                impares[auxImpar++] = a[i];
            }
        }
        System.out.println("Pares");
        for (int i = 0; i < pares.length; i++) {
            System.out.print(pares[i] + " ");
        }

        System.out.println("\nImPares");
        for (int i = 0; i < impares.length; i++) {
            System.out.print(impares[i] + " ");
        }

    }
}
