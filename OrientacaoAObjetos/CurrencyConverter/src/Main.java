import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double cotacao;
        double dolares;

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Qual é a cotacao do dolar?");
        cotacao = sc.nextDouble();

        System.out.println("Quantos dolares voce quer comprar?");
        dolares = sc.nextDouble();

        System.out.printf("Voce tera que pagar %.2f reais%n", reais(dolares, cotacao));

        sc.close();
    }

    public static double reais(double dolares, double cotacao) {
        return ((dolares * cotacao) * 0.06) + (dolares * cotacao);
    }
}