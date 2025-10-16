import java.util.Scanner;

public class Entradas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);             // CRIA A VARIAVEL DA ENTRADA
        System.out.println("Digite o nome do aluno: ");
        String nome = entrada.nextLine();                     // PEGA A ENTRADA E ARMAZENA EM "nome"
        System.out.println("Digite a idade do aluno: ");
        int idade = entrada.nextInt();
        System.out.println("O nome do aluno: " + nome);
        System.out.println("A idade do aluno:" + idade);       // MOSTRA A ENTRADA
    }
}
