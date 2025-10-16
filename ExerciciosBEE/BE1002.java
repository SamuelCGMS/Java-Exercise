package PastadeCria;
import java.util.Scanner;

public class BE1002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Varaiaveis
        double raio;
        double n = 3.14159;
        // Processamento
        raio = scanner.nextDouble();
        // Saida
        System.out.printf("A=%.4f%n", (raio * raio) * n);


    }
}
