package ExerciciosBEE;

import java.util.Scanner;

public class BE1142 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int valorn = teclado.nextInt();
        int n = 1;

        for (int cont = 1; cont <= valorn; cont++) {
            System.out.println(n + " " + (n + 1) + " " + (n + 2) + " PUM");
            n+=4;
        }
    }
}
