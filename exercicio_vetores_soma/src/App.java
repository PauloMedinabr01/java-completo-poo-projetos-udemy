import java.util.Locale;
import java.util.Scanner;

/*
* Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida: 
* - Imprimir todos os elementos do vetor 
* - Mostrar na tela a soma e a média dos elementos do vetor 
*/

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < n; i++) {
            soma = soma + vetor[i];
        }

        double media = soma / n;

        System.out.print("VALORES = ");

        for (int i = 0; i < n; i++) {
            System.out.printf("%.1f  ", vetor[i]);
        }

        System.out.printf("\nSOMA = %.2f\n", soma);
        System.out.printf("MEDIA = %.2f\n", media);

        sc.close();
    }
}