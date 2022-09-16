import java.util.Scanner;

public class TTEliminarElementoArregloSolucion {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un numero: ");
            numeros[i] = s.nextInt();
        }

        System.out.println();
        System.out.println("Ingrese posicion a eliminar (0-9)");
        int posicionEliminar = s.nextInt();

        for (int i = numeros.length; posicionEliminar < i - 1; posicionEliminar++) {
            numeros[posicionEliminar] = numeros[posicionEliminar + 1];
        }

        for (int numero : numeros) {
            System.out.println("numero = " + numero);
        }


    }
}
