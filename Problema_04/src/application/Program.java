package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Aluno;

/*
 * Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nas provas
 * Ao final, mostrar qual a nota final do aluno, a média e dizer também se o aluno está 
 * aprovado ou reprovado.
 */

public class Program {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Informe o nome do aluno: ");
        aluno.nome = sc.nextLine();

        System.out.println("Informe as notas do aluno: ");
        aluno.nota1 = sc.nextDouble();
        aluno.nota2 = sc.nextDouble();
        aluno.nota3 = sc.nextDouble();

        if (aluno.calcularMedia() > 6) {
            System.out.println("Aluno Aprovado.");
        } else {
            System.out.println("Aluno Reprovado.");
        }

        System.out.println(aluno.toString());

        sc.close();
    }

}
