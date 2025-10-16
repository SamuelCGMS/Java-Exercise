package Beecrowd;
import java.util.Scanner;

public class BE1006 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Variaveis
        double A, B, C, me;
        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();
        // Processamento
        me = ((A * 2) + (B * 3) + (C * 5)) / 10;
        // Saida
        System.out.printf("MEDIA = %.1f%n", me);
        teclado.close();
    }
}
