package ExerciciosBEE;

import java.util.Scanner;

public class BEE1073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorn = sc.nextInt();
        int valorsobe = 2;


        for (int contador = 2; contador <= valorn; contador+=2) {
            if (valorn % 2 == 0) {
                System.out.println(valorsobe + "^2 " + "= " + valorsobe * valorsobe);
                valorsobe+=2;

            } else if (valorn % 2 != 0) {
                System.out.println(valorsobe + "^2 " + "= " + valorsobe * valorsobe);
                valorsobe+=2;
            }
        }
        sc.close();
    }
}
