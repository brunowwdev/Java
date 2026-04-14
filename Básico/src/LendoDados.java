import java.util.Locale;

public class LendoDados {
    public static void main(String[] args) {
        int n = 10;
        double n2= 10.1214;
        String nome = "Bruno";
        int idade = 32;
        double renda = 4000.0;

        System.out.println(n); // print de um numero inteiro
        System.out.println(n2); // print de um double
        System.out.printf("%.2f%n", n2); // print de um double com duas casas decimais
        System.out.printf("%.4f%n", n2); // print de um double com quatro casas decimais
        Locale.setDefault(Locale.US); // ao inves de por as casas decimais com virgula ele poe com ponto
        System.out.printf("%.4f%n", n2); // print de um double com quatro casas decimais
        System.out.println("resultado = " + n + " metros"); //concatenando string com int
        System.out.printf("resultado = %.2f metros%n", n2); //concatenando string com int
        System.out.printf("%s tem %d anos e ganha %.2f reais%n", nome, idade, renda);
    }
}