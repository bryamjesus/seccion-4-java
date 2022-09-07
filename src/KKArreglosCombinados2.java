public class KKArreglosCombinados2 {

    public static void llenarArrays(int[] array, int incrementador, int multipicador) {
        int lengthArray = array.length;
        for (int i = 0; i < lengthArray; i++) {
            array[i] = (i + incrementador) * multipicador;
        }
    }

    public static void recorrerArray(int[] array) {
        int lengthArray = array.length;
        for (int i = 0; i < lengthArray; i++) {
            System.out.println("i = " + i + " valor: " + array[i]);
        }
    }

    public static void main(String[] args) {
        int[] a, b, c;
        a = new int[12];
        b = new int[12];
        c = new int[24];

        llenarArrays(a, 1, 1);
        llenarArrays(b, 1, 5);

        int aux = 0;
        for (int i = 0; i < b.length; i += 3) {
            for (int j = 0; j < 3; j++) {
                c[aux++] = a[i + j];

            }
            for (int j = 0; j < 3; j++) {
                c[aux++] = b[i + j];

            }
        }

        recorrerArray(c);
    }


}
