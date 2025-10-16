/*
Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos.
Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados, com um dígito após o ponto decimal.
**Entrada
A entrada contém 6 números que podem ser valores inteiros ou de ponto flutuante. Pelo menos um destes números será positivo.
**Saída
O primeiro valor de saída é a quantidade de valores positivos. A próxima linha deve mostrar a média dos valores positivos digitados.
Exemplo de Entrada	Exemplo de Saída
7
4 valores positivos
7.4
*/

package ExerciciosBEE;

import java.util.Scanner;

public class BE1064PT2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float valores;
        int positivo = 0;
        float media = 0;

        for (int contador = 1; contador <= 6; contador++) {
            valores = sc.nextFloat();
            if (valores > 0) {
                positivo++;
                media = media + valores;

            }
        }
        System.out.println(positivo + " valores positivos");
        System.out.printf("%.1f\n", (media / positivo));
        sc.close();
    }

}
