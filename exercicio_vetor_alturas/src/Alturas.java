import java.util.Locale;
import java.util.Scanner;

/*
 * Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, 
 * mostrar na tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com 
 * menos de 16 anos, bem como os nomes dessas pessoas caso houver. 
 */

public class Alturas {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão comparadas: ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa");
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();
        }

        double somaAlturas = 0.0;
        for (int i = 0; i < n; i++) {
            somaAlturas = somaAlturas + alturas[i];
        }

        double mediaAlturas = somaAlturas / n;

        System.out.printf("Media das alturas= %.2f", mediaAlturas);

        int cont = 0;
        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                cont = cont + 1;
            }
        }

        System.out.println();
        double porcentagem = cont * 100.0 / n;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%", porcentagem);
        System.out.println();

        for (int i = 0; i < alturas.length; i++) {
            if (idades[i] < 16) {
                System.out.println(nomes[i]);
            }
        }
        sc.close();
    }

}
