package model.services;

public class BrazilTaxService {

    public double tax(double ammount) {
        if (ammount < 100) {
            return ammount * 0.2;
        } else {
            return ammount * 0.15;
        }
    }
}
