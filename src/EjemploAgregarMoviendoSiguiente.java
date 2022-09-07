import java.util.Scanner;

public class EjemploAgregarMoviendoSiguiente {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] numeros = new int[10];
        int largoNumeros = numeros.length;

        System.out.println("Ingrese 9 numeros");
        for (int i = 0; i < largoNumeros - 1; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = s.nextInt();
        }

        System.out.print("\nIngrese nuevo numero: ");
        int elemento = s.nextInt();
        System.out.print("Ingrese posicion a la cual quiere que se encuentre: ");
        int posicion = s.nextInt();

        for (int i = largoNumeros - 2; i >= posicion; i--) {
            numeros[i + 1] = numeros[i];
        }

        numeros[posicion] = elemento;

        System.out.println();
        for (int numero : numeros) {
            System.out.println("numeros = " + numero);
        }

    }
}
