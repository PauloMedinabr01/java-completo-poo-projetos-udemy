package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

/*
 * Uma operadora de telefonia cobra R$ 50.00 por um plano básico que
 * dá direito a 100 minutos de telefone. Cada minuto que exceder a * franquia de 
 * 100 minutos custa R$ 2.00. Fazer um programa para ler a quantidade de minutos que 
 * uma pessoa consumiu, daí mostrar o valor a ser pago. Adicionados ao comentarios
 * exemplos de operadores de atribuição cumilativa.
 * 
 *                           a += b; a = a + b;
 *                           a -= b; a = a - b;
 *                           a *= b; a = a * b;
 *                           a /= b; a = a / b;
 *                           a %= b; a = a % b;
 *
 */

public class Exercicio10 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de minutos utilizados: ");
        int minutos = sc.nextInt();

        double conta = 50.0;

        if (minutos > 100) {
            conta += (minutos - 100) * 2;
            // conta = conta + (minutos - 100) * 2;
        }

        System.out.printf("O valor da conta = R$ %.2f", conta);

    }
}
