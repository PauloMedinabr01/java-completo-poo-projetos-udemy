package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os dados da conta ");
        System.out.print("Numero da conta: ");
        int number = sc.nextInt();
        System.out.print("Titular da conta: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Saldo inicial: ");
        double balance = sc.nextDouble();
        System.out.print("Limite de saque: ");
        double withdrawLimit = sc.nextDouble();

        Account acc = new Account(number, holder, balance, withdrawLimit);

        System.out.println();
        System.out.print("Informe a quantia para saque: ");
        double amount = sc.nextDouble();

        if (amount > acc.getWithdrawlimit()) {
            System.out.println("Erro de saque: A quantia excede o valor limite de saque. ");
        } else if (amount > acc.getBalance()) {
            System.out.println("Erro de saque: Saldo insuficiente. ");
        } else {
            acc.withdraw(amount);
            System.out.printf("Saldo atualizado: %.2f%n", acc.getBalance());
        }

        sc.close();

    }
}
