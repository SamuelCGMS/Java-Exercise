package exerciciosia.GEMINI.laçoderepetição;

import java.util.Scanner;

public class exerciciosia02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        for (int contador = 1; contador <= 10; contador++) {

            System.out.println("Tabuada do número " + numero + " x " + contador + " = " + (numero * contador) );
        }
        sc.close();
    }
}
/*
Número do exercício: 1
Tempo: Entre 1 e 5 minutos.
Classe: Repetição
IA: GEMINI
Dificuldade: Extremamento Fácil.
Feito sozinho: Sim 100%

Notas: Bem fácil.
 */
