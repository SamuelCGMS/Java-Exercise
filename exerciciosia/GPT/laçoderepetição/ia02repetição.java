/*
Enunciado: Exercício 2 – Tabuada

Peça ao usuário um número X e mostre a tabuada dele de 1 até 10.
Exemplo: se o usuário digitar 7, a saída deve ser:
7 x 1 = 7
7 x 2 = 14
...
7 x 10 = 70

 */
package exerciciosia.GPT.laçoderepetição;

import java.util.Scanner;

public class ia02repetição {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // inicio
        System.out.println("== Calculadora de Multiplicação ==");
        System.out.print("Digite o número para ver a Tabuada : ");
        int numerotabuada = entrada.nextInt();
        int multiplicacoes = 1;
        // desenvolvimento
        for (int cont = 1; cont <= 10; cont++) {
            System.out.println((numerotabuada + " x " + multiplicacoes + " = ") + numerotabuada * cont);
            multiplicacoes++;
        }

        // fim
        entrada.close();
    }
}

/*
Número do exercício: 2
Tempo: Entre 10 e 20 minutos.
Classe: Repetição
IA: GPT
Dificuldade: Fácil <-- baseado no meu conhecimento atual.
Feito sozinho: Sim 100%

Notas: Achei tranquilo, consegui fazer tudo facilmente. Só travei no começo para como começar a fazer.
 */