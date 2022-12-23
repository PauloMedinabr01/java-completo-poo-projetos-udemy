/*
 * Fazer um programa para ler um número inteiro N e a altura de N pessoas. Armazene as N alturas 
 * em um vetor. Em seguida, mostrar a altura média dessas pessoas.
 */

import java.util.Locale;
import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de pessoas para armazenar a altura: ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < n; i++) {
            soma += vect[i];
        }

        double media = soma / n;

        System.out.printf("Altura calculada de %d pessoas, soma das alturas: %.2f, media das alturas %.2f",
                n, soma, media);

        sc.close();

    }
}