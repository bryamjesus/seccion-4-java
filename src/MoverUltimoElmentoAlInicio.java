import java.util.Scanner;

public class MoverUltimoElmentoAlInicio {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numeros = new int[10];
        int largoNumeros = numeros.length, aux = 0;

        for (int i = 0; i < largoNumeros; i++) {
            System.out.print("Ingrese un numero = ");
            numeros[i] = s.nextInt();
        }

        for (int i = largoNumeros - 1; 0 < i; i--) { //
            aux = numeros[i]; // 10
            numeros[i] = numeros[i - 1];
            numeros[i - 1] = aux;
        }

        for (int i = 0; i < largoNumeros; i++) {
            System.out.println("numeros[i] = " + numeros[i]);
        }
    }
}
