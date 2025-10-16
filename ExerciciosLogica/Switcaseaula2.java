import java.util.Scanner;

public class Switcaseaula2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha seu tipo de conta: ");
        String tipoConta = entrada.nextLine();

        if (tipoConta == null || tipoConta.trim().isEmpty()) {
            System.out.println("Entrada inválida. Por favor, informe um tipo de conta.");
        } else {
            processarTipoConta(tipoConta);
        }

        entrada.close();
    }

    private static void processarTipoConta(String tipoConta) {
        switch (tipoConta.trim().toLowerCase()) {
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
    }
}
