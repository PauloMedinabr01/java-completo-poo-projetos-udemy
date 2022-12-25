import java.util.Scanner;
/*
 * Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, 
 * mostre na tela todos os números pares, e também a quantidade de números pares.
 */

public class NumerosPares {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int n, qtdpares;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("\nNUMEROS PARES:");

        qtdpares = 0;
        for (int i = 0; i < n; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.printf("%d  ", vetor[i]);
                qtdpares++;
            }
        }

        System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", qtdpares);

        sc.close();
    }
}
