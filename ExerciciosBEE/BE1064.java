package ExerciciosBEE;
import java.util.Scanner;

public class BE1064 {
    public static void main(String[] args) {
        // Declarações
        int positivo = 0;
        float valor,media = 0;
        Scanner entrada = new Scanner(System.in);
        // Desenvolvimento
        for (int cont = 1; cont <=6; cont++) {
            valor = entrada.nextFloat();
            if (valor > 0) {
            media += valor;
            positivo++;
            }
        }
        // Fim
        System.out.println(positivo + " valores positivos");
        System.out.printf("Media: %.1f\n", (media/positivo));
        entrada.close();
    }
}


