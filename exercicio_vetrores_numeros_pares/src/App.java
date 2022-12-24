import java.util.Locale;
import java.util.Scanner;

public class App {

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

            System.out.println("Números pares: ");
            int qtdpares = 0;
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
}
