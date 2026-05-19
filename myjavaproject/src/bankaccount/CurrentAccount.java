package bankaccount;

public class CurrentAccount extends Account {

    public CurrentAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    // Override: 2% annual interest
    @Override
    public double calculateInterest() {
        return balance * 2.0 / 100;
    }
}
