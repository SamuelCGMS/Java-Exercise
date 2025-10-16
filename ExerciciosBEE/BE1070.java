
package ExerciciosBEE;
import java.util.Scanner;
public class BE1070 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x = entrada.nextInt();

        if ( x % 2 == 0 ) {
            x++;
        }

        for (int cont =1; cont <=6; cont++) {
            System.out.println(x);
            x+=2;
        }
    }
}

