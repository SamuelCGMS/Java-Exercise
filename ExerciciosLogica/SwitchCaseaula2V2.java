import java.util.Scanner;

public class SwitchCaseaula2V2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira seu salário: ");
        int salario = entrada.nextInt();

        entrada.nextLine(); // Limpa o buffer do scanner

        System.out.println("Escolha seu tipo de conta: ");
        String tipoConta = entrada.nextLine();

        switch (tipoConta.toLowerCase()) {
            case "corrente":
                System.out.println("Você escolheu conta corrente.");
                break;
            case "poupança":
                System.out.println("Você escolheu conta poupança.");
                break;
            case "investimento":
                System.out.println("Você escolheu conta de investimento.");
                break;
            default:
                System.out.println("Tipo de conta não reconhecido.");
        }
        System.out.println("Na sua conta " + tipoConta + " o salário é: " + salario);
    }
}