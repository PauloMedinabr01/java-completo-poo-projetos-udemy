package entities;

public class SavingsAccont extends Account {

    private Double interestRate;

    public SavingsAccont() {
        super();
    }

    public SavingsAccont(Double interestRate) {
        this.interestRate = interestRate;
    }

    public SavingsAccont(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }

}
