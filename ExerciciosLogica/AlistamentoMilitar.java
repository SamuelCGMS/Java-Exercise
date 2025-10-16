import java.util.Scanner;

/**
 * Programa para simular o processo de alistamento militar.
 * Aceita sexo (M/F) e idade como entrada e determina o status de alistamento.
 */
public class AlistamentoMilitar {

    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        char sexo = ' '; // Variável para armazenar o sexo
        int idade = 0;   // Variável para armazenar a idade

        // Loop para solicitar e validar o sexo
        boolean sexoValido = false;
        while (!sexoValido) {
            System.out.print("Digite o sexo (M para Masculino, F para Feminino): ");
            String inputSexo = scanner.nextLine().toUpperCase(); // Lê a linha e converte para maiúsculas

            if (inputSexo.length() == 1) {
                char s = inputSexo.charAt(0);
                if (s == 'M' || s == 'F') {
                    sexo = s;
                    sexoValido = true; // Sexo é válido, sai do loop
                } else {
                    System.out.println("Entrada de sexo inválida. Por favor, digite M ou F.");
                }
            } else {
                System.out.println("Entrada de sexo inválida. Por favor, digite apenas M ou F.");
            }
        }

        // Loop para solicitar e validar a idade
        boolean idadeValida = false;
        while (!idadeValida) {
            System.out.print("Digite a idade: ");
            if (scanner.hasNextInt()) {
                idade = scanner.nextInt();
                scanner.nextLine(); // Consome a nova linha restante após nextInt()
                if (idade > 0 && idade < 130) { // Validação básica de idade
                    idadeValida = true; // Idade é válida, sai do loop
                } else {
                    System.out.println("Idade inválida. Por favor, digite uma idade razoável.");
                }
            } else {
                System.out.println("Entrada de idade inválida. Por favor, digite um número.");
                scanner.nextLine(); // Consome a entrada inválida
            }
        }

        // Aplica as regras de alistamento
        if (sexo == 'M') { // Se o sexo for Masculino
            if (idade >= 18) {
                System.out.println("Alistamento obrigatório");
            } else {
                System.out.println("Alistamento não permitido");
            }
        } else if (sexo == 'F') { // Se o sexo for Feminino
            if (idade >= 18) {
                System.out.print("Deseja se alistar? (S para Sim, N para Não): ");
                String respostaAlistamento = scanner.nextLine().toUpperCase();
                if (respostaAlistamento.equals("S")) {
                    System.out.println("Alistamento voluntário registrado.");
                } else if (respostaAlistamento.equals("N")) {
                    System.out.println("Opção de não alistamento registrada.");
                } else {
                    System.out.println("Resposta inválida. Por favor, responda com S ou N.");
                }
            } else {
                System.out.println("Alistamento não permitido");
            }
        }

        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}