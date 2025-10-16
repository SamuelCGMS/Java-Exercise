package PastadeCria;
import java.util.Scanner;

public class BE1005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // variaveis
        double A, B, MEDIA;
        A = sc.nextDouble();
        B = sc.nextDouble();

        // Processamento
        MEDIA = ((A * 3.5) + (B * 7.5)) / 11.0;


        // Saida
        System.out.printf("MEDIA = %.5f%n", MEDIA);
        sc.close();
    }
}
