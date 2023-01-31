package services;

import java.time.LocalDate;

import entities.Contract;
import entities.Installment;

public class ContractService {

    private OnLinePaymentService onLinePaymentService;

    public ContractService(OnLinePaymentService onLinePaymentService) {
        this.onLinePaymentService = onLinePaymentService;
    }

    public void proccesContract(Contract contract, int months) {

        double basicQuota = contract.getTotalValue() / months; // parcela basica

        for (int i = 0; i < months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i); // pega a data e adiona os meses as quantidade de

            double interest = onLinePaymentService.interest(basicQuota, i); // calcular o juro de cada mês
            double fee = onLinePaymentService.paymentFee(basicQuota + interest); // taxa de juros na parcela //
            double quota = basicQuota + interest + fee; // parcelas - data original mais um mês

            contract.getInstallments().add(new Installment(dueDate, quota));
        }
    }
}
