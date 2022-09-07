public class FFOrdenarArrayMetodoBurbuja {
    public static void main(String[] args) {
        System.out.println("=====================STRING==================");
        String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxyxy", "Disco Duro SSD Samsung Externo", "Asus NoteBook", "Macbook Air", "Chromecast 4ta generación", "Bicicleta Oxford"};
        int largoString = productos.length;

        int cont = 0;
        for (int i = 0; i < largoString; i++) {
            for (int j = 0; j < largoString; j++) {
                if (productos[i].compareTo(productos[j]) < 0) {
                    String auxiliar = productos[i];
                    productos[i] = productos[j];
                    productos[j] = auxiliar;
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
