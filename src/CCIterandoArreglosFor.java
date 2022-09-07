import java.util.Arrays;

public class CCIterandoArreglosFor {
    public static void main(String[] args) {
        System.out.println("=====================STRING==================");
        String[] productos = new String[7];

        int largoString = productos.length; // para optimización

        for (int i = 0; i < largoString; i++) {
            System.out.println("Para indice " + i + ": " + productos[i]);
        }

        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxyxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus NoteBook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generación";
        productos[6] = "Bicicleta Oxford";

        System.out.println("-----------------------------------");
        for (int i = 0; i < largoString; i++) {
            System.out.println("Para indice " + i + ": " + productos[i]);
        }

        System.out.println("---------------For--------------------");
        Arrays.sort(productos);
        for (int i = 0; i < largoString; i++) {
            System.out.println("Para indice " + i + ": " + productos[i]);
        }

        System.out.println("--------------ForEach---------------------");
        for (String prod : productos) {
            System.out.println("prod = " + prod);
        }

        System.out.println("-----------------While------------------");
        int i = 0;
        while (i < largoString) {
            System.out.println("Para indice " + i + ": " + productos[i]);
            i++;
        }

        System.out.println("-----------------Do-While------------------");
        i = 0;
        do {
            System.out.println("Para indice " + i + ": " + productos[i]);
            i++;
        } while (i < largoString);

        System.out.println("\n=====================INT==================");
        int[] numeros = new int[10];
        int largoInt = numeros.length;

        for (i = 0; i < largoInt; i++) {
            numeros[i] = i * 3;
        }

        for (i = 0; i < largoInt; i++) {
            System.out.println("numeros = " + numeros[i]);
        }
    }
}
