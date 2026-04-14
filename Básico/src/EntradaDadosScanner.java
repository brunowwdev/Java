import java.util.Locale;
import java.util.Scanner;

public class EntradaDadosScanner {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int y;
        double z;
        char a;

        String x;
        x = sc.next(); //permite que leia uma palavra e armazene na variavel x que esta em memoria
        y = sc.nextInt();
        z = sc.nextDouble(); //ele pega  a localidade do sistema
        a = sc.next().charAt(0);
        System.out.println("Dados digitados");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
        sc.close();
    }
}
