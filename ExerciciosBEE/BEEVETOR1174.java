package ExerciciosBEE;

import java.util.Scanner;

public class BEEVETOR1174 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valor[] = new double[100];

        for (int pos = 0; pos < valor.length; pos++) {
            valor[pos] = sc.nextDouble();
        }
        for (int pos = 0; pos < valor.length; pos++) {
            if (valor[pos] <= 10) {
                System.out.printf("A[%d] = %.1f\n", pos, valor[pos]);
            }
        }
    }
}
