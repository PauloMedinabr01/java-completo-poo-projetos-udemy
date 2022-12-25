import java.util.Locale;
import java.util.Scanner;

/*
 * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na
 *  tela o maior número do vetor (supor não haver empates). Mostrar também a posição do maior 
 * elemento, considerando a primeira posição como 0 (zero). 
 */

public class MaiorPosicao {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, posmaior;
        double maior;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }

        maior = vetor[0];
        posmaior = 0;

        for (int i = 1; i < n; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posmaior = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.1f\n", maior);
        System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posmaior);

        sc.close();
    }
}
