public class ImpostoDeRenda {
    public static void main(String[] args) {
        double salario = 3752;

        if (salario <= 1903.98) {
            System.out.println("Isento, VIVA BOLSONARO");
        } else if (salario >= 1903.99 && salario <= 2826.65) {
            System.out.println("7.5% VIVA LULA " + salario * 0.075);
            System.out.println("7.5% LULALA " + (salario * 0.075)); // ASSIM É MAIS RECOMENDADO
        } else if (salario >= 2826.66 && salario <= 3751.05) {
            System.out.println("15% FAZ O L " + (salario * 0.15));
        } else if (salario >= 3751.06 && salario <= 4664.68) {
            System.out.println("22.5% MAKE THE L " + (salario * 0.225));
        } else {
            System.out.println("22.5% L MÁXIMO " + (salario * 0.275));
        }
    }
}