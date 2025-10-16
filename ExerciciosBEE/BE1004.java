package PastadeCria;
import java.util.Scanner;

public class BE1004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Variaveis
        int A, B, PROD;
        // Procesamento
        A = sc.nextInt();
        B = sc.nextInt();
        PROD = A * B;
        //Saida
        System.out.println("PROD = " + PROD);

        sc.close();
    }
}
