public class IIEjemploArregloOrdenPrincipioFinal {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int[] a = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        int aux = 0;
        for (int i = 0; i < numeros.length - i; i++) { // / 2
            /*System.out.print(numeros[i] + " ");
            System.out.println(numeros[numeros.length - i - 1]);*/
            a[aux++] = numeros[i];
            a[aux++] = numeros[numeros.length - 1 - i];
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println("i = " + i + " valor: " + a[i]);
        }
    }
}
