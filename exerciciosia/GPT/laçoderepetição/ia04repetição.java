/*
Exercício 2 (WHILE ou DO WHILE) – Digitação até sair zero


Peça números ao usuário repetidamente e vá somando todos. O programa só deve parar quando o usuário digitar 0.
No final, mostre a soma.
Digite um número: 5
Digite um número: 10
Digite um número: 7
Digite um número: 0
Soma final: 22
 */
package exerciciosia.GPT.laçoderepetição;
import java.util.Scanner;

public class ia04repetição {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //inicio
        int soma = 0;
        int numero;

        System.out.print("Digite um número: ");
        numero = teclado.nextInt();

        while (numero != 0) {
            soma += numero; // acumula
            System.out.print("Digite um número: ");
            numero = teclado.nextInt(); // lê de novo
        }

    }
}
