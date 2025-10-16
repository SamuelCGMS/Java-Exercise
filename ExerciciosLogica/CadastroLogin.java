import java.util.Scanner;

public class CadastroLogin {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu Login: ");
        String nome = sc.next();
        if (nome.equalsIgnoreCase("admin") || nome.equalsIgnoreCase("Administrador")) {
            System.out.println("Usuario ja cadastrado");
        } else {
            System.out.println(nome + " Cadastrado com sucesso! ");
        }
    }
}