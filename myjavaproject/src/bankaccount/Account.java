package bankaccount;

public class Account {
    protected String accountHolder;
    protected double balance;

    public Account(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance        = balance;
    }

    // Base method — overridden by child classes
    public double calculateInterest() {
        return 0;
    }

    public void printInterest() {
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance        : " + balance);
        System.out.println("Interest       : " + calculateInterest());
        System.out.println("----------------------------");
    }
}