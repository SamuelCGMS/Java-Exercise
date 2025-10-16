import java.util.Scanner;

public class whiles02V2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 3) {
            System.out.println("1. Calcular Imposto");
            System.out.println("2. Depositar Saldo");
            System.out.println("3. Sair");
            System.out.println("Digite sua Opção!");
            opcao = sc.nextInt();
        }
    }
}
