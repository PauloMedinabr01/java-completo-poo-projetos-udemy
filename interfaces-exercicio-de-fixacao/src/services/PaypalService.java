package services;

public class PaypalService implements OnLinePaymentService {

    @Override
    public double paymentFee(double ammount) {
        return ammount * 0.02;
    }

    @Override
    public double interest(double ammount, int months) {
        return ammount * 0.01 * months;
    }

}
