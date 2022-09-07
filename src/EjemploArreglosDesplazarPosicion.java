import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numeros = new int[10];
        int largoNumeros = numeros.length, ultimo = 0;

        for (int i = 0; i < largoNumeros; i++) {
            System.out.print("Ingrese un numero = ");
            numeros[i] = s.nextInt();
        }

        ultimo = numeros[numeros.length - 1];
        for (int i = numeros.length - 2; i >= 0; i--) {
            numeros[i + 1] = numeros[i];
        }

        numeros[0] = ultimo;

        for (int i = 0; i < largoNumeros; i++) {
            System.out.println("numeros[i] = " + numeros[i]);
        }
    }
}
