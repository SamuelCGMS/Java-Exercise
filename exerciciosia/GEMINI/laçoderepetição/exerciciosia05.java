/*
Exercício 5: Contando as Vogais de uma Palavra
Objetivo: Peça ao usuário para digitar uma palavra. Em seguida, use um laço for para percorrer cada letra da palavra e contar quantas vogais (a, e, i, o, u) ela possui.

Exemplo:

Entrada: "abacaxi"

Saída: A palavra 'abacaxi' tem 4 vogais.
 */

package exerciciosia.GEMINI.laçoderepetição;

import java.util.Scanner;

public class exerciciosia05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();
        int vogal = 0;

        for (int cont = 1; cont < palavra.length(); cont++) {
            vogal = cont;
        }
        System.out.println("A palavra: " + palavra + ", tem " + vogal + " vogal");
    }
}

/*
Tentei fazer apenas por 5 minutos, mas não terminei.
Está incompleto e provavelmente errado.
 */