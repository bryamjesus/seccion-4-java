import java.util.Arrays;

public class AAEjemploArregloInt {
    public static void main(String[] args) {
        System.out.println("=====================INT==================");

        int[] numeros = new int[4];

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[3];

        System.out.println("i = " + i); // 0
        System.out.println("j = " + j); // 0
        System.out.println("k = " + k); // 0
        System.out.println("l = " + l); // 0
        System.out.println("-----------------------------------");

        numeros[0] = 10;
        numeros[1] = Integer.valueOf("7");
        numeros[2] = 35;
        numeros[3] = -1;
        /* numeros[4] = 5;  Tira una Exception */

        i = numeros[0];
        j = numeros[1];
        k = numeros[2];
        l = numeros[3];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
        System.out.println("-----------------------------------");

        int ultimoElemento = numeros[numeros.length - 1];
        System.out.println("ultimoElemento = " + ultimoElemento);
        System.out.println("-----------------------------------");

        Arrays.sort(numeros);

        i = numeros[0];
        j = numeros[1];
        k = numeros[2];
        l = numeros[3];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}
