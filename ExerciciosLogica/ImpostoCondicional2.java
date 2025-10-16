public class ImpostoCondicional2 {
    public static void main(String[] args) {

        double salario = 5000;
        double resultado = 0;
        String porcentagem = ""; // A STRING NÃO TEM NADA NA MEMORIA (PROPOSITAL)
        if (salario > 4500) {
            resultado = salario * 0.30;
            porcentagem = "30%"; // ALOCA 30% NA MEMORIA
        } else {
            resultado = salario * 0.15;
            porcentagem = "15%"; // ALOCA 15% NA MEMORIA
        }
        System.out.println("A porcentagem é: " + porcentagem + " O imposto da porcentagem é: " + resultado + " O salário é: " + salario);
    }
}