package estrutura_condicional;

import java.util.Scanner;

/*
 * Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
 */

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int N = sc.nextInt();

        if (N % 2 == 0) {
            System.out.println("Número PAR");
        } else {
            System.out.println("Número IMPAR");
        }

        sc.close();
    }
}
