package services;

public interface OnLinePaymentService {

    double paymentFee(double ammount);

    double interest(double ammount, int months);

}
