package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

    public static void main(String[] args) {

        Account x = new Account(1000, "Paulo Medina", 1000.0);
        Account y = new SavingsAccount(1001, "Esdra Lemes", 1000.0, 0.01);

        x.withdraw(50.0);
        y.withdraw(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());

        System.out.println(x);
        System.out.println(y);

    }
}