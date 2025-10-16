/*
Enunciado: Exercício 1 – Soma dos N primeiros números

Peça ao usuário um número N e calcule a soma de todos os números de 1 até N.
Exemplo: se o usuário digitar 5, a saída deve ser 15 (pois 1+2+3+4+5 = 15).
 */
package exerciciosia.GPT.laçoderepetição;

import java.util.Scanner;

public class ia01repetição {
    public static void main(String[] args) {
        //
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o número: ");
        int numero = teclado.nextInt();
        int soma = 0;
        //
        for (int cont = 1; cont <= numero; cont++) {
            soma += cont;
            System.out.print(cont);
            //
            if (cont != numero) {             // olhe notas
                System.out.print(" + ");      // olhe notas
            }
        }
        System.out.println((" = ") + soma);
    }
}

/*
Número do exercício: 1
Tempo: Entre 20 e 35 minutos.
Classe: Repetição
IA: GPT
Dificuldade: média <-- baseado no meu conhecimento atual.
Feito sozinho: 90%.

Notas: Suponha a Saída 5, o resultado é:
1 + 2 + 3 + 4 + 5 = 15
Porém, meu programa original dava: 1 + 2 + 3 + 4 + 5 + = 15 / não estava errado, mas queria igualmente ao enunciado
Não consegui resolver o problema do + = sozinho, recorri à IA e ela utilizou o IF para consertar.
Espero manter esse conhecimento, para não recorrer à IA no futuro.
 */