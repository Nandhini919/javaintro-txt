package bankaccount;

public class SavingsAccount extends Account {

    public SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    // Override: 6% annual interest
    @Override
    public double calculateInterest() {
        return balance * 6.0 / 100;
    }
}