package ExerciciosBEE;

import java.util.Scanner;

public class BEE1070PT2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();

        for (int contador = 1; contador <= 6; contador++) {
            if (valor % 2 != 0) {
                valor += 2;
                System.out.println(valor);
            } else {
                valor += 1;
                System.out.println(valor);
            }
        }
    }
}

