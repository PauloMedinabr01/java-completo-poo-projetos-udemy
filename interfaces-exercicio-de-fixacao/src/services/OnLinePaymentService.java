package services;

public interface OnLinePaymentService {

    double paymentFee(double ammount); // taxa de pagamento

    double interest(double ammount, int months); // Juros

}
