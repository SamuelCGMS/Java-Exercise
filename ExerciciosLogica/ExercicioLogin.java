import java.util.Scanner;

//Apresentar ao usuario uma tela login e depois senha, usuario e senha correto armazenado em
// constantes. Se o usuario acertar ambos exibir mensagem Acesso concedido, caso contrário NEGADO,
// e voltar a pedir usuario e senha novamente
public class ExercicioLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String login = "Samuel";
        String password = "Samuel123";
        while (true) {
            System.out.print("Login: ");
            String user = input.nextLine();
            System.out.print("Password: ");
            String pass = input.nextLine();
            if (user.equals(login) && pass.equals(password)) {
                System.out.println("Login efetuado com sucesso!");
            } else {
                System.out.println("Login ou Senha incorreta!");
            }
        }
    }
}
