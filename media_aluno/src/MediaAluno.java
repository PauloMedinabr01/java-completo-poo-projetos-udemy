import java.util.Locale;
import java.util.Scanner;

/*
 * Fazer um programa para ler as 3 notas de um aluno, calcular a soma das 3 notas, a media final
 * e informar se o aluno está aprovado, reprovado ou de recuperação.
 */

public class MediaAluno {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe as notas do aluno: ");
        System.out.println();
        System.out.print("Digite a primeira nota: ");
        int n1 = sc.nextInt();
        System.out.print("Digite a segunda nota: ");
        int n2 = sc.nextInt();
        System.out.print("Digite a terceira nota: ");
        int n3 = sc.nextInt();

        int soma = n1 + n2 + n3;
        System.out.println("A soma das notas é = " + soma);

        double media = soma / 3;
        if (media > 6) {
            System.out.println("Aprovado! " + "Sua media foi = " + media);
        } else if (media == 6) {
            System.out.println("Recuperação! " + "Sua media foi = " + media);
        } else {
            System.out.println("Reprovado! " + "Sua media foi = " + media);
        }

    }
}
