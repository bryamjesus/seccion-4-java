import java.util.Arrays;
import java.util.Collections;

public class EEModificarArregloInversa {
    public static void arregloInverso(String[] arreglo) {
       /*for (int i = 0; i < largoString / 2; i++) {
            String actual = productos[i];
            String inverso = productos[largoString - 1 - i];
            productos[i] = inverso;
            productos[largoString - 1 - i] = actual;
        }*/

        int largoString = arreglo.length;
        int largoString2 = arreglo.length;
        for (int i = 0; i < largoString2; i++) {
            String actual = arreglo[i];
            String inverso = arreglo[largoString - 1 - i];
            arreglo[i] = inverso;
            arreglo[largoString - 1 - i] = actual;
            largoString2--;
        }
    }

    public static void main(String[] args) {
        System.out.println("=====================STRING==================");
        String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxyxy", "Disco Duro SSD Samsung Externo", "Asus NoteBook", "Macbook Air", "Chromecast 4ta generación", "Bicicleta Oxford"};

        int largoString = productos.length; // para optimización
        Arrays.sort(productos);

        System.out.println("----------------Invertir posicion del arreglo-------------------");
        arregloInverso(productos);

        for (int i = 0; i < largoString; i++) {
            System.out.println("Para indice " + i + ": " + productos[i]);
        }

        System.out.println("----------------Volviendo al orden original-------------------");
        Collections.reverse(Arrays.asList(productos)); // El collectiones recibe un List

        for (int i = 0; i < largoString; i++) {
            System.out.println("Para indice " + i + ": " + productos[i]);
        }

    }
}
