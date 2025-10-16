public class TorneioExercicio {
    public static void main(String[] args) {
        String nome = "Samuel";
        int idade = 19;
        String nome2 = "Gabriel";
        String nome3 = "Lucas";
        String nome4 = "Felipe";
        if (idade <= 10) {
            System.out.println(nome2 + " Classe Infatil");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println(nome4 + " Juvenil");
        } else if (idade >= 16 && idade <= 19) {
            System.out.println(nome3 + " Adolescente");
        } else {
            System.out.println(nome + " Adulto");
        }
    }
}
