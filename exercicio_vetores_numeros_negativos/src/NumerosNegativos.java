import java.util.Locale;
import java.util.Scanner;

/*
 * Faça um programa que leia um número inteiro positivo N e depois N números 
 * inteiros e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos 
 * lidos. 
 */

public class NumerosNegativos {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("Números negativos: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0) {
                System.out.println(vetor[i]);
            }
        }

        sc.close();

    }
}
