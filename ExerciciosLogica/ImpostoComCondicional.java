public class ImpostoComCondicional {
    public static void main(String[] args) {

        double salario = 4800;

        if (salario < 4500) {

            System.out.println(salario * 0.30);                 // CALCULA 30%
            // OU PODEMOS FAZER ASSIM ( MELHOR PARA UMA BOA PRÁTICA DE PROGRAMAÇÃO.
            double trintaPorcento = salario * 0.30;
            System.out.println(trintaPorcento);
        } else {
            System.out.println(salario * 0.15);                 // CALCULA 15%
            double quinzePorcento = salario * 0.15;             // METODO MAIS RECOMENDADO
            System.out.println(quinzePorcento);
        }
    }
}
