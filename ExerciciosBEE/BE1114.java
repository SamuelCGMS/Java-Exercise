package ExerciciosBEE;

import java.util.Scanner;

public class BE1114 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int senha;

        do {
            senha = entrada.nextInt();
            if (senha != 2002) {
                System.out.println("Senha Invalida");
            } else {
                System.out.println("Acesso Permitido");
            }

        } while (senha != 2002);
        entrada.close();
    }
}

