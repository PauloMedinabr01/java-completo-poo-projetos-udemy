package services;

import java.time.LocalDate;
import entities.Contract;
import entities.Installment;

public class ContractService { // responsável por gerar o serviço e processar o contrato - depende do
                               // OnLinePaymentService

    private OnLinePaymentService onLinePaymentService;

    public ContractService(OnLinePaymentService onLinePaymentService) {
        this.onLinePaymentService = onLinePaymentService;
    }

    public void procesContract(Contract contract, int months) {

        double basicQuota = contract.getTotalValue() / months; // Valor da parcela basica

        for (int i = 1; i <= months; i++) { // Gera as parcelas
            LocalDate dueDate = contract.getDate().plusMonths(i); // Pega a data e adiciona os meses as parcelas

            double interest = onLinePaymentService.interest(basicQuota, i); // calcular o juro de cada mês
            double fee = onLinePaymentService.paymentFee(basicQuota + interest); // calcular a taxa de juros na parcela
                                                                                 // //
            double quota = basicQuota + interest + fee; // parcelas - data original mais um mês

            contract.getInstallments().add(new Installment(dueDate, quota));
        }
    }
}
