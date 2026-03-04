package com.languagefundamentals.constructor;

public class BankAccount {
    String accountHolder;
    String accountNo;
    String accountType;
    double balance;

    BankAccount(String accountHolder, String accountNo, String accountType, double balance) {
        System.out.println("BankAccount Constructor called!");
        this.accountHolder = accountHolder;
        this.accountNo = accountNo;
        this.accountType = accountType;
        this.balance = balance;
    }

   
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Priya", "SBI123456", "Savings", 50000.0);
        b1.accountInfo();
    }
    void accountInfo() {
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account No     : " + accountNo);
        System.out.println("Account Type   : " + accountType);
        System.out.println("Balance        : " + balance);
    }

}
