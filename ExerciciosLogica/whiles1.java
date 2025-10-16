import java.util.Scanner;

public class whiles1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = input.nextInt();
        int i = 0;
        while (i <= num) {
            if (i % 2 != 0) {
                System.out.println("i " + i);
            }
            i++;
        }
    }
}
