import java.util.Arrays;

public class BBEjemploArregloString {
    public static void main(String[] args) {
        System.out.println("=====================STRING==================");

        String[] productos = new String[7];
        System.out.println("productos[0] = " + productos[0]); // Arrojara NULL si no se inicializa
        System.out.println("productos[1] = " + productos[1]);
        System.out.println("productos[2] = " + productos[2]);
        System.out.println("productos[3] = " + productos[3]);
        System.out.println("productos[4] = " + productos[4]);
        System.out.println("productos[5] = " + productos[5]);
        System.out.println("productos[6] = " + productos[6]);
        System.out.println("-----------------------------------");

        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxyxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus NoteBook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generación";
        productos[6] = "Bicicleta Oxford";

        String prod1 = productos[0];
        String prod2 = productos[1];
        String prod3 = productos[2];
        String prod4 = productos[3];
        String prod5 = productos[4];
        String prod6 = productos[5];
        String prod7 = productos[6];

        System.out.println("prod1 = " + prod1);
        System.out.println("prod2 = " + prod2);
        System.out.println("prod3 = " + prod3);
        System.out.println("prod4 = " + prod4);
        System.out.println("prod5 = " + prod5);
        System.out.println("prod6 = " + prod6);
        System.out.println("prod7 = " + prod7);
        System.out.println("-----------------------------------");

        Arrays.sort(productos); // Ordena de forma alfabetica o numerica el array

        prod1 = productos[0];
        prod2 = productos[1];
        prod3 = productos[2];
        prod4 = productos[3];
        prod5 = productos[4];
        prod6 = productos[5];
        prod7 = productos[6];

        System.out.println("prod1 = " + prod1);
        System.out.println("prod2 = " + prod2);
        System.out.println("prod3 = " + prod3);
        System.out.println("prod4 = " + prod4);
        System.out.println("prod5 = " + prod5);
        System.out.println("prod6 = " + prod6);
        System.out.println("prod7 = " + prod7);


    }
}
