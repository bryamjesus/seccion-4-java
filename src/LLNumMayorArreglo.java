import java.util.Map;
import java.util.Scanner;

public class LLNumMayorArreglo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[5];

        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }

        int max = 0;
        for (int i = 1; i < a.length; i++) {
            max = (a[max] > a[i]) ? max : i;
        }

        System.out.println("a[max] = " + a[max]);
    }
}
