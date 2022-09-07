import java.util.Scanner;

public class PPBuscarArregloString {
    public static void main(String[] args) {
        String[] a = new String[4];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese un nombre: ");
            a[i] = s.next();
        }

        System.out.println("\nIngrese un numero a buscar: ");
        String nombre = s.next();


        int i = 0;
        /*
        while (i < a.length && a[i] != num) {
            i++;
        }
        */

        for (; i < a.length && !a[i].equalsIgnoreCase(nombre); i++) {
        }

        if (i == a.length) {
            System.out.println("Número no se ha encontrado");
        } else if (a[i].toLowerCase().compareTo(nombre.toLowerCase()) == 0) { // 1 -> si es igual
            System.out.println("Encontrado en la posicion: " + i);
        }
    }
}
