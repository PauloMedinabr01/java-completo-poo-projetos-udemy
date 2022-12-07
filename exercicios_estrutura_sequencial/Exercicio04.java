package exercicios_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

/*
 * Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, 
 * o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o 
 * número e o salário do funcionário, com duas casas decimais.
 */

public class Exercicio04 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int id, horas;
        double valorHora, salario;

        System.out.print("Digite o ID do funcionário: ");
        id = sc.nextInt();
        System.out.print("Digite as horas trabalhadas: ");
        horas = sc.nextInt();
        System.out.print("Digite o valor da hora trabalhada: ");
        valorHora = sc.nextDouble();

        salario = valorHora * horas;

        System.out.println("ID do funcionário = " + id);
        System.out.printf("Salário = R$ %.2f%n", salario);

        sc.close();
    }
}