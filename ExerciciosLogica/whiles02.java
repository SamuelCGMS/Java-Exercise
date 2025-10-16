import java.util.Scanner;

public class whiles02 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Menu De Opções, Selecione o Número : 1 Para Calculadora de Imposto 2 Para Depositar Saldo 3 Para Sair");
            int opcao = sc.nextInt();
            switch(opcao) {
                case 1:
                    System.out.println("Calculadora de Imposto");
                    break;
                case 2:
                    System.out.println("Depositar saldo");
                    break;
                case 3:
                    System.out.println("Sair");
                    break;
            }
    }
}
