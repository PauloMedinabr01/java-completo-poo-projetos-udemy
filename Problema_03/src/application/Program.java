package application;

import java.util.Locale;
import java.util.Scanner;

/*
* Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em 
* seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
* salário do funcionário com base em uma porcentagem dada (somente o salário bruto é 
* afetado pela porcentagem) e mostrar novamente os dados do funcionário.
*/

import entities.Funcionario;

public class Program {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        Funcionario emp = new Funcionario();

        System.out.print("Nome: ");
        emp.nome = sc.nextLine();
        System.out.print("Salario bruto: ");
        emp.salarioBruto = sc.nextDouble();
        System.out.print("Taxa: ");
        emp.taxa = sc.nextDouble();

        System.out.println();
        System.out.println("Funcionario: " + emp);
        System.out.println();
        System.out.print("Qual a porcentagem de aumento de salario? ");

        double porcentagem = sc.nextDouble();
        emp.aumentarSalario(porcentagem);

        System.out.println();
        System.out.println("Dados atualizados.: " + emp);
        sc.close();

    }
}
