package application;

import java.util.Locale;
import java.util.Scanner;
import util.ConversorDeMoeda;

/*
 * Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por
 * uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando 
 * ainda que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe 
 * Conversor de moeda para ser responsável pelos cálculos.
 */
public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual é o preço do dólar? ");
        double cotacaoDolar = sc.nextDouble();

        System.out.print("Quantos dólares serão comprados? ");
        double montante = sc.nextDouble();

        double resultado = ConversorDeMoeda.dolarParaReal(montante, cotacaoDolar);
        System.out.printf("Valor a ser pago em reais = R$ %.2f%n", resultado);

        sc.close();
    }
}
