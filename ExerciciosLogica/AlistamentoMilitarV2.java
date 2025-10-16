import java.util.Scanner;

public class AlistamentoMilitarV2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite Seu Nome: ");
        String nome = entrada.nextLine();

        char sexo = ' '; // Inicializa a variável sexo
        boolean sexoValido = false;
        while (!sexoValido) {
            System.out.println("Digite Seu Sexo (M ou F): ");
            String inputSexo = entrada.next().toUpperCase(); // Lê e converte para maiúsculo
            if (inputSexo.length() == 1 && (inputSexo.charAt(0) == 'M' || inputSexo.charAt(0) == 'F')) {
                sexo = inputSexo.charAt(0);
                sexoValido = true;
            } else {
                System.out.println("Sexo inválido. Por favor, digite M ou F.");
            }
        }
        entrada.nextLine(); // Consome a nova linha deixada pelo next()

        System.out.println("Digite Sua Idade: ");
        int idade = 0;
        boolean idadeValida = false;
        while(!idadeValida) {
            if (entrada.hasNextInt()) {
                idade = entrada.nextInt();
                if (idade > 0) { // Adiciona uma validação básica para idade positiva
                    idadeValida = true;
                } else {
                    System.out.println("Idade inválida. Digite um número positivo.");
                }
            } else {
                System.out.println("Entrada inválida para idade. Digite um número.");
                entrada.next(); // Descarta a entrada inválida
            }
        }
        entrada.nextLine(); // Consome a nova linha deixada pelo nextInt()

        if (sexo == 'M') {
            if (idade >= 18) {
                System.out.printf("Alistamento Obrigatório: Nome: %s | Idade: %d | Sexo: %c%n", nome, idade, sexo);
            } else {
                // Ajuste na mensagem e nos especificadores de formato
                System.out.printf("Alistamento não permitido. Nome: %s | Idade: %d | Sexo: %c%n", nome, idade, sexo);
            }
        } else if (sexo == 'F') {
            if (idade >= 18) {
                System.out.println("Deseja se alistar? (Sim/Não)");
                String resposta = entrada.nextLine(); // Usar nextLine() para capturar a resposta completa
                if (resposta.equalsIgnoreCase("sim")) {
                    // Ajuste nos especificadores de formato
                    System.out.printf("Alistado com Sucesso. Nome: %s | Idade: %d | Sexo: %c%n", nome, idade, sexo);
                } else if (resposta.equalsIgnoreCase("não") || resposta.equalsIgnoreCase("nao")) {
                    System.out.println("Você desejou não se alistar!");
                } else {
                    System.out.println("Resposta inválida para o alistamento voluntário.");
                }
            } else {
                System.out.println("Alistamento não permitido!");
            }
        }
        // O else "Não reconhecido!" não é mais estritamente necessário aqui
        // porque a entrada de sexo agora é validada no loop.

        entrada.close(); // Boa prática fechar o Scanner
    }
}
