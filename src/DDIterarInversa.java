import java.util.Arrays;

public class DDIterarInversa {
    public static void main(String[] args) {
        System.out.println("=====================STRING==================");
        //String[] productos = new String[7];
        String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxyxy", "Disco Duro SSD Samsung Externo", "Asus NoteBook", "Macbook Air", "Chromecast 4ta generación", "Bicicleta Oxford"};

        int largoString = productos.length; // para optimización

        /* productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxyxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus NoteBook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generación";
        productos[6] = "Bicicleta Oxford"; */

        Arrays.sort(productos);
        System.out.println("----------------For-------------------");
        for (int i = 0; i < largoString; i++) {
            System.out.println("Para indice " + i + ": " + productos[i]);
        }

        System.out.println("----------------Iterando Inversa-------------------");
        for (int i = 0; i < largoString; i++) {
            System.out.println("para i = " + (largoString - 1 - i) + " valor " + productos[largoString - i - 1]);
        }

        System.out.println("----------------Iterando Inversa 2-------------------");
        for (int i = largoString - 1; i >= 0; i--) {
            System.out.println("para i = " + (i) + " valor " + productos[i]);
        }

    }
}
