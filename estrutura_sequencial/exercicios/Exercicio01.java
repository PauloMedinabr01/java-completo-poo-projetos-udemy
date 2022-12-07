package exercicios;

import java.util.Scanner;
import java.util.Locale;

/*
 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela 
 * a soma desses números com uma mensagem explicativa, conforme exemplos
 */

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // int a, b, soma;

        System.out.print("Digite o valor de A: ");
        int a = sc.nextInt();
        // a = sc.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = sc.nextInt();
        // b = sc.nextInt();

        int soma = a + b;

        System.out.println("Soma de A + B = " + soma);

        sc.close();

    }

}
