import entities.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product p = new Product();

        System.out.println("Digite o nome, o preco e a quantidade do produto");
        p.name = sc.nextLine();
        p.price = sc.nextDouble();
        p.quantity = sc. nextInt();

        System.out.println("Dados do produto: " + p.name + ", " + p.price + ", " + p.quantity);

        System.out.println("Digite a quantidade de produtos a serem adicionados no estoque");
        int q = sc.nextInt();
        p.AddProduct(q);;

        System.out.println("Dados atualizados do produto: " + p.name + ", " + p.price + ", " + p.quantity);

        System.out.println("Digite a quantidade de produtos a serem removidos no estoque");
        q = sc.nextInt();
        p.RemoveProduct(q);

        System.out.println("Dados atualizados do produto: " + p.name + ", " + p.price + ", " + p.quantity);

        sc.close();
    }
}