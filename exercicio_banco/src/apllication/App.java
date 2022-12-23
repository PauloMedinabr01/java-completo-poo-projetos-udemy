package apllication;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Conta conta;

        System.out.println("Digite o número da conta: ");
        int numero = sc.nextInt();
        System.out.println("Digite o nome do titular da conta: ");
        sc.nextLine();
        String titular = sc.nextLine();
        System.out.println("Tem depósito inicial? (s ou n)? ");
        char resposta = sc.next().charAt(0);

        if (resposta == 's') {
            System.out.println("Entre o valor inicial de depósito: ");
            double depositoInicial = sc.nextDouble();
            conta = new Conta(numero, titular, depositoInicial);
        }

        else {
            conta = new Conta(numero, titular);
        }

        System.out.println();
        System.out.println(conta.toString());

        System.out.println();
        System.out.print("Entre com um valor para depósito: ");
        double deposito = sc.nextDouble();
        conta.depositar(deposito);
        System.out.println("Dados atualizados da conta: ");
        System.out.println(conta);

        System.out.println();
        System.out.print("Entre com um valor para saque: ");
        double sacar = sc.nextDouble();
        conta.sacar(sacar);
        System.out.println("Dados atualizados da conta: ");
        System.out.println(conta);

        sc.close();

    }
}
