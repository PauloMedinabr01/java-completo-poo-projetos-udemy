package program;

import java.util.Locale;
import java.util.Scanner;

/*
 * Fazer um programa para ler um número inteiro N e a altura de N pessoas. 
 * Armazene as N alturas em um vetor. Em seguida, mostrar a altura média dessas pessoas.
 */

public class Program {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; n < vect.length; i++) {
            sc.nextInt();
            vect[i] = sc.nextInt();
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += vect[i];
        }
        double avg = sum / n;
        System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
        sc.close();
    }
}
