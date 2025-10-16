import java.util.Scanner;

public class TabuadaDeQualquerNúmero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tabuada");
        System.out.print("Digite um numero: ");
        int num = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i*num);
        }
    }
}

