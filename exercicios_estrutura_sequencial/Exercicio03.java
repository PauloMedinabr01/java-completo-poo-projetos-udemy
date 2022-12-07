package exercicios_estrutura_sequencial;

import java.util.Scanner;

/*
 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e 
 * mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: 
 * DIFERENCA = (A * B - C * D)
 */

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 4 numeros inteiros: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int diferenca = a * b - c * d;

        System.out.println("DIFERENCA = " + diferenca);
    }
}
