public class GGMejoraMetodoBurjuja {
    public static void main(String[] args) {
        System.out.println("=====================STRING==================");

        String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxyxy", "Disco Duro SSD Samsung Externo", "Asus NoteBook", "Macbook Air", "Chromecast 4ta generación", "Bicicleta Oxford"};
        int largoString = productos.length;

        System.out.println("productos = " + productos[0].compareTo(productos[1]));

        int cont = 0;
        for (int i = 0; i < largoString - 1; i++) {
            for (int j = 0; j < largoString - 1 - i; j++) {
                if (productos[j + 1].compareTo(productos[j]) < 0) {
                    String auxiliar = productos[j];
                    productos[j] = productos[j + 1];
                    productos[j + 1] = auxiliar;
                }
                cont++;
            }
        }

        System.out.println("cont = " + cont);

        for (int i = 0; i < largoString; i++) {
            System.out.println("Para indice " + i + ": " + productos[i]);
        }
    }
}
