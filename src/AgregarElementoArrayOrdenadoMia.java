public class AgregarElementoArrayOrdenadoMia {
    public static void main(String[] args) {
        int[] numeros = {15, 17, 19, 23, 25, 27, 0};

        int numeroIngresar = 21;
        for (int i = numeros.length - 2; i > 0; i--) {
            numeros[i + 1] = numeros[i];
            if (numeros[i] < numeroIngresar) {
                numeros[i + 1] = numeroIngresar;
                i = -1;
            }
        }

        for (int numero : numeros) {
            System.out.println("numero = " + numero);
        }


    }
}
