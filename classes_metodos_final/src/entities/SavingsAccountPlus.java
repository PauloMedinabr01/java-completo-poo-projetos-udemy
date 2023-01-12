package entities;

public class SavingsAccountPlus extends SavingsAccount {

    @Override
    public void withdraw(double amount) {
        balance -= amount;
        /*
         * Não é possível substituir o método final de SavingsAccountJava(67109265)
         */
    }
}
