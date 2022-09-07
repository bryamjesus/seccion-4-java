public class HHBurbujaInt {

    public static void sortBurbuja(Object[] arreglo) {
        int largo = arreglo.length;
        for (int i = 0; i < largo; i++) {
            for (int j = 0; j < largo - i - 1; j++) {
                if (((Comparable) arreglo[j + 1]).compareTo(arreglo[j]) < 0) {
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = auxiliar;
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] numeros = new Integer[4];
        numeros[0] = 10;
        numeros[1] = Integer.valueOf("7");
        numeros[2] = 35;
        numeros[3] = -1;
        int largoInt = numeros.length;

        sortBurbuja(numeros); // tiene que se Integer por que si es un primitivo no se va a poder

        for (int i = 0; i < largoInt; i++) {
            System.out.println("i = " + i + ": " + numeros[i]);
        }

    }
}
