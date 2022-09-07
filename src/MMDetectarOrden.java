import java.util.Scanner;

public class MMDetectarOrden {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[7];
        System.out.println("Ingrese 7 numeros");

        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }

        boolean ascendente = false, descendente = false;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                descendente = true;
            }
            if (a[i] < a[i + 1]) {
                ascendente = true;
            }
        }

        if (ascendente == true && descendente == true) {
            System.out.println("Arreglo = desordenado");
        }
        if (ascendente == false && descendente == false) {
            System.out.println("Arreglo = todos son iguales");
        }

        if (ascendente == true && descendente == false) {
            System.out.println("Arreglo = ordenado de forma ascendente");
        }

        if (ascendente == false && descendente == true) {
            System.out.println("Arreglo = ordenado de forma descendente");
        }

    }
}
