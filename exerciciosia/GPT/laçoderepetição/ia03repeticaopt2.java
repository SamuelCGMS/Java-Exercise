/*
Enunciado: Exercício 3 (FOR) – Potências de 2
Peça um número N e mostre todas as potências de 2 até 2^N.
Exemplo (N = 5):
2 4 8 16 32
 */
package exerciciosia.GPT.laçoderepetição;
import java.util.Scanner;
public class ia03repeticaopt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeron = sc.nextInt();

        int potencia = 1;

        for (int contador = 1; contador <= numeron; contador++) {
            potencia = potencia * 2;
            System.out.print("Potencia: " + potencia );




        }
    }
}
