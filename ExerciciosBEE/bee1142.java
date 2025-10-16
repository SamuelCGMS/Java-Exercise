package ExerciciosBEE;
import java.util.Scanner;
public class bee1142 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numero = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(numero + " " + (numero+1) + " " + (numero+2) + " PUM ");
        }


        sc.close();
    }
}

