package estrutura_repetitiva_for;

import java.util.Scanner;

/*
 * Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
 * segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
 */

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int x = sc.nextInt();
            int y = sc.nextInt();

            if (y == 0) {
                System.out.println("divisao impossivel");
            } else {
                double div = (double) x / y;
                System.out.printf("%.1f%n", div);
            }
        }

        sc.close();
    }
}
