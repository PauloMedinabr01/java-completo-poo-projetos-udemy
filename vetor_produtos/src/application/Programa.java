package application;

/*
 *  Fazer um programa para ler um número inteiro N e os dados (nome e preço) de N Produtos.
 *  Armazene os N produtos em um vetor. Em seguida, mostrar o preço médio dos produtos.
 */

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vetor = new Product[n];

        for (int i = 0; i < vetor.length; i++) {
            sc.nextLine();
            System.out.println("Nome do produto:");
            String nome = sc.nextLine();
            System.out.println("Preço do produto:");
            double preco = sc.nextDouble();
            vetor[i] = new Product(nome, preco);
        }

        double soma = 0.0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i].getPreco();
        }

        double media = soma / vetor.length;

        System.out.printf("Media de preço dos produtos= R$ %.2f.", media);

        sc.close();

    }
}