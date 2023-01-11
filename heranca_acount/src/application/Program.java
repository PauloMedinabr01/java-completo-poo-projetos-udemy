package application;

import entities.Account;
import entities.BusinessAccount;

public class Program {

    public static void main(String[] args) {

        Account acc = new Account(1749, "Paulo Medina", 0.0);
        BusinessAccount bacc = new BusinessAccount(1000, "Esdra", 0.0, 500.0);

        Account acc1 = bacc;

        System.out.println(acc.toString());
        System.out.println();
        System.out.println(bacc.toString());
        System.out.println();
        System.out.println(acc1.toString());
    }
}