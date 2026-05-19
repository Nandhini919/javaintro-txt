package bankaccount;

public class BankAccount {
    public static void main(String[] args) {

        Account savings = new SavingsAccount("Nandhu", 50000);
        Account current = new CurrentAccount("vamsi",   80000);

        savings.printInterest();  // Calls SavingsAccount.calculateInterest()
        current.printInterest();  // Calls CurrentAccount.calculateInterest()
    }
}