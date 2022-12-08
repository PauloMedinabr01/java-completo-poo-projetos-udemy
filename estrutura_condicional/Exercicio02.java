package estrutura_condicional;

import java.util.Scanner;

/*
 * Fazer um programa para ler 3 números inteiros e depois informar a soma das 3 notas, 
 * calcular a média das notas e dizer se o aluno foi:
 * Aluno aprovado, aluno em recuperação ou aluno reprovado.
 */

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        int n1 = sc.nextInt();

        System.out.print("Digite a segunda nota: ");
        int n2 = sc.nextInt();

        System.out.print("Digite a terceira nota: ");
        int n3 = sc.nextInt();

        int soma = n1 + n2 + n3;

        System.out.println("A soma das notas foi de: " + soma);

        int media = soma / 3;

        System.out.println("A media das notas foi de: " + media);

        if (media <= 5) {
            System.out.println("Aluno Reprovado.");

        } else if (media == 6) {
            System.out.println("Aluno em Recuperação.");
        } else {
            System.out.println("Aluno Aprovado.");
        }

        sc.close();
    }
}
