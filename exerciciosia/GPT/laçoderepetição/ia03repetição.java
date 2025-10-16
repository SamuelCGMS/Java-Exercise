/*
Enunciado: Exercício 3 (FOR) – Potências de 2
Peça um número N e mostre todas as potências de 2 até 2^N.
Exemplo (N = 5):
2 4 8 16 32
 */
package exerciciosia.GPT.laçoderepetição;
import java.util.Scanner;

public class ia03repetição {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeropedido = teclado.nextInt();
        int numerodecretado = 2;

        for (int cont = 1; cont <= numeropedido; cont++) {

            System.out.print((numerodecretado) + " ");
            numerodecretado = numerodecretado * 2;

        }
    }
}
/*
Número do exercício: 3
Tempo: Entre 18 a 25 minutos.
Classe: Repetição
IA: GPT
Dificuldade: Entre fácil e médio <-- baseado no meu conhecimento atual.
Feito sozinho: Sim 100%

Notas: Tive um pouco mais de dificuldade em desenvolver, por isso a dificuldade está entre fácil e média.
Quando comecei a de fato pensar e escrever o que meu programa fazia, se tornou bem mais fácil.
 */