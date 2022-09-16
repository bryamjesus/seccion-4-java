import java.util.Scanner;

public class UUInserarElementoIncrementandoTamañoArreglo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] numeros = new int[10];
        int longitud = numeros.length, elemento, posicion, ultimo;

        for (int i = 0; i < longitud; i++) {
            System.out.print("Ingrese un numero: ");
            numeros[i] = s.nextInt();
        }

        System.out.println();
        System.out.println("Ingrese numero a ingresar");
        elemento = s.nextInt();

        System.out.println("Ingrese posición a la cual quiere ingresar (0 - 9)");
        posicion = s.nextInt();

        ultimo = numeros[longitud - 1];
        for (int i = longitud - 2; i >= posicion; i--) {
            numeros[i + 1] = numeros[i];
        }

        int[] b = new int[longitud + 1];
        System.arraycopy(numeros, 0, b, 0, longitud); // El ultimo elemento que se manda es la cantidad de elementos a copiar

        b[posicion] = elemento;
        b[b.length - 1] = ultimo;

        System.out.println("ARREGLO");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
