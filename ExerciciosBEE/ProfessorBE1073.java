package ExerciciosBEE;

import java.util.Scanner;

public class ProfessorBE1073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int limite = sc.nextInt();

        for ( int cont=2; cont<=limite; cont+=2) {
            System.out.println(cont + "^" + "2" + " = " + cont * cont);
        }

    }

}
