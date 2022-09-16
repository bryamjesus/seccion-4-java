import java.util.Scanner;

public class TTEliminarElementoArreglo {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese numero " + (i + 1) + ": ");
            numeros[i] = s.nextInt();
        }

        System.out.println();
        System.out.println("Ingrese posicion a eliminar (0-9)");
        int posicion = s.nextInt();

        for (int i = posicion; i < numeros.length - 1; i++) {
            numeros[i] = numeros[i + 1];
        }

        /*for (int i = 0; i < numeros.length -1; i++) {
            System.out.println( i +" = " +numeros[i]);
        }*/

        int[] b = new int[numeros.length-1];
        System.arraycopy(numeros,0, b,0,b.length);

        for (int i = 0; i < b.length -1; i++) {
            System.out.println( i +" = " +b[i]);
        }
    }
}
