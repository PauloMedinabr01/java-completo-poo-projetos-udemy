package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

/*
 * Estrutura switch-case
 * Quando se tem várias opções de fluxo a serem tratadas com base no valor de uma variável,
 * ao invés de várias estruturas if-else encadeadas, alguns preferem utilizar a 
 * estrutura switch-case.
 * Problema exemplo
 * Fazer um programa para ler um valor inteiro de 1 a 7 representando um dia da semana 
 * (sendo 1=domingo, 2=segunda, e assim por diante). Escrever na tela o dia da semana 
 * correspondente, conforme exemplos.
 */

public class SwitchCase {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero de 1 a 7: ");
        int x = sc.nextInt();

        String dia;
        switch (x) {
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "segunda";
                break;
            case 3:
                dia = "terca";
                break;
            case 4:
                dia = "quarta";
                break;
            case 5:
                dia = "quinta";
                break;
            case 6:
                dia = "sexta";
                break;
            case 7:
                dia = "sabado";
                break;
            default:
                dia = "valor invalido"; // default
                break;
        }
        System.out.println("Dia da semana: " + dia);
        sc.close();
    }
}

/*
 * Resolução usando if
 * String dia;
 * 
 * System.out.println("Digite um numero de 1 a 7: ");
 * int x = sc.nextInt();
 * 
 * if (x == 1) {
 * dia = "domingo";
 * }
 * else if (x == 2) {
 * dia = "segunda";
 * }
 * else if (x == 3) {
 * dia = "terca";
 * }
 * else if (x == 4) {
 * dia = "quarta";
 * }
 * else if (x == 5) {
 * dia = "quinta";
 * }
 * else if (x == 6) {
 * dia = "sexta";
 * }
 * else if (x == 7) {
 * dia = "sabado";
 * }
 * else {
 * dia = "valor invalido";
 * }
 * System.out.println("Dia da semana: " + dia);
 * sc.close();
 * }
 * }
 */