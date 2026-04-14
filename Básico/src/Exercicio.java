import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int minutos;
        double custo = 50.0;

        System.out.println("Digite o numero de minutos usados");
        minutos = sc.nextInt();

        if(minutos > 100){
            custo += (minutos - 100) * 2;
            System.out.println("O custo é = " + custo);
        }else{
            custo = 50;
            System.out.println("O custo é = " + custo);
        }
        sc.close();
    }
}
