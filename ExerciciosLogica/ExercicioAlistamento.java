/*
Como secretário de alistamento militar eu gostaria que meu sistema aceitasse os seguintes parâmetros
para que eu possa agilizar o processo de cadastramento:
sexo, sendo válido apenas M ou F e idade.
Se o sexo for M e a idade for maior ou igual a 18 o sistema deve imprimir alistamento obrigatório
se o sexo for M e a idade for menor que 18 o sistema deve imprimir, alistament não permitido
se o sexo for F e a idade for maior igual a 18 o sistema deve perguntar se a pessoa deseja se alistar
se o sexo for F e a idade for menor que 18 o sistema deve imprimir alistamento não permitido
 */


import java.util.Scanner;

public class ExercicioAlistamento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite Seu Nome: ");
        String nome = entrada.nextLine();

        System.out.println("Digite Seu Sexo: ");
        char sexo = entrada.next().charAt(0);

        System.out.println("Digite Seu Idade: ");
        int idade = entrada.nextInt();

        if (sexo == 'M' && idade >=18 ) {
            System.out.printf("Alistamento Obrigatório: Nome: %s | Idade: %d | Sexo: %c%n", nome, idade, sexo);
        } else if (sexo == 'M' && idade <18) {
            System.out.printf("Alistamento não é Obrigatório %s %s %s%n", nome, idade, sexo);
        } else if (sexo == 'F' && idade >=18) {
            System.out.println("Deseja se alistar?");
            if (entrada.next().equalsIgnoreCase("sim")) {
                System.out.printf("Alistado com Sucesso %s %s %s%n", nome, idade, sexo);
            } else {
                System.out.println("Você desejou não se alistar!");
            }
        } else if (sexo == 'F' && idade <18) {
            System.out.println("Alistamento não permitido!");
        } else {
            System.out.println("Não reconhecido!");
        }

    }

}
