package exercicios;
/*
 * Exercício de fixação
 */

import java.util.Locale;

public class ExercicioDeFixacao {
    public static void main(String[] args) {

        String produto1 = "Computador";
        String produto2 = "Mesa de computador";
        byte idade = 40;
        int id = 5290;
        char genero = 'M';
        double preco1 = 2100.0;
        double preco2 = 650.50;
        double medida = 53.234567;

        System.out.println("Productos:");
        System.out.printf("%s, qual é o preço? R$ %.2f%n", produto1, preco1);
        System.out.printf("%s, qual é o preço? R$ %.2f%n", produto2, preco2);
        System.out.println();
        System.out.printf("Registro: %d anos, ID %d e genero: %c%n", idade, id, genero);
        System.out.println();
        System.out.printf("Medida com oito casas decimais: %.8f%n", medida);
        System.out.printf("Arredondado (três casas decimais): %.3f%n", medida);
        Locale.setDefault(Locale.US);
        System.out.printf("Ponto decimal dos EUA: %.3f%n", medida);
    }
}
