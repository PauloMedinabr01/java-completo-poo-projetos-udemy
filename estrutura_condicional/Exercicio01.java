package estrutura_condicional;

import java.util.Scanner;

/*
 * Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo
 * ou não.
 */

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("NUMERO NEGATIVO");
        } else {
            System.out.println("NUMERO POSITIVO");
        }

        sc.close();
    }
}
