/*
 * Resumo da aula
• System.out.print
• System.out.println
• System.out.printf
• %d
• %f
• %s
• %n
• Locale
• Como concatenar vários elementos em um mesmo comando de escrita
• Exemplos
 */

import java.util.Locale;

public class SaidaDedados {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        int x = 5;
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;

        // Exibe o texto com quebra de linha
        System.out.println("Bom dia!");

        // Exibe o texto sem quebra de linha
        System.out.print("Boa tarde!");
        System.out.println("Bom dia!");

        /*
         * Para concatenar vários elementos em um mesmo comando de escrita
         * usando print e println
         */
        System.out.println("RESULTADO = " + x + " METROS.");

        /*
         * Concatenar vários elementos em um mesmo comando de escrita usando printf
         * %f = ponto flutuante, %d = inteiro, %s = texto, %n = quebra de linha
         */
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais.%n", nome, idade, renda);

    }
}
