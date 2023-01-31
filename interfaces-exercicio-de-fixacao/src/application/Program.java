package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;

public class Program {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Entrada de dados do contrato
        System.out.println("Entre com os dados do contrato: ");
        System.out.print("Numero do contrato: ");
        int number = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), fmt); // DateTimeFormatter fmt - pega o texto no sc.next e lê a data
                                                          // no formato dd/MM/yyyy
        System.out.print("Valor do contrato: ");
        double totalValue = sc.nextDouble();
        // Entrada de dados do contrato

        // Cria o contrato - obj
        Contract obj = new Contract(number, date, totalValue);
        // obj instaciado após a leitura dos dados de acordo com o construtor

        System.out.print("Entre com o número de parcelas: "); // Lê o número de parcelas
        int n = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService()); // Instancia o obj ContractService

        contractService.procesContract(obj, n); // chama o obj passando o contrato e o numero de parcelas e gera no
                                                // número de parcelas

        System.out.println("Parcelas: ");
        for (Installment installment : obj.getInstallments()) { // percorre as parcelas (obj.getInstallments())
            System.out.println(installment);
        }

        sc.close();
    }
}
