public class JJArreglosCombinados {

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
        a = new int[10];
        b = new int[10];
        c = new int[20];

        llenarArrays(a, 1, 1);
        llenarArrays(b, 1, 5);

        int aux = 0;
        for (int i = 0; i < 10; i++) {
            c[aux++] = a[i];
            c[aux++] = b[i];
        }

        recorrerArray(c);
    }


}
