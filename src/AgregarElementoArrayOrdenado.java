import java.util.Scanner;

public class AgregarElementoArrayOrdenado {
    public static void main(String[] args) {
        int[] a = new int[7];
        int numero, posision;

        Scanner s = new Scanner(System.in);
        for (int i = 0; i < a.length - 1; i++) {
            System.out.print("Ingrese un numero: ");
            a[i] = s.nextInt();
        }

        System.out.println();

        System.out.println("Ingrese en un numero a insertar");
        numero = s.nextInt();
        posision = 0;

        while (posision < 6 && numero > a[posision]) {
            posision++;
        }

        for (int i = a.length - 2; i >= posision; i--) {
            a[i + 1] = a[i];
        }

        a[posision] = numero;
        System.out.println("El nuevo arreglo");
        for(int as : a){
            System.out.println("as = " + as);
        }
    }
}
