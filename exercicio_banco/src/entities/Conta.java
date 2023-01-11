package entities;

public class Conta {

    private int numeroDaConta;
    private String titular;
    private double saldo;

    public Conta() {
    }

    public Conta(int numeroDaConta, String titular) {
        this.numeroDaConta = numeroDaConta;
        this.titular = titular;
    }

    public Conta(int numeroDaconta, String titular, double depositoInicial) {
        this.numeroDaConta = numeroDaconta;
        this.titular = titular;
        depositar(depositoInicial);
    }

    public int getNumeroDaconta() {
        return numeroDaConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double deposito) {
        saldo += deposito;
    }

    public void sacar(double saque) {
        saldo -= saque + 5;
    }

    public String toString() {
        return "Número da conta= "
                + numeroDaConta
                + ", Titular da conta= "
                + titular
                + ", Saldo em conta= R$"
                + String.format("%.2f", saldo);

    }

}
