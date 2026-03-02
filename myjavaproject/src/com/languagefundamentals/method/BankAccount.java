package com.languagefundamentals.method;

public class BankAccount {

		    static double deposit(double balance, double amount) {
		        return balance + amount;
		    }

		    static double withdraw(double balance, double amount) {
		        if (amount > balance) {
		            System.out.println("❌ Insufficient Balance!");
		            return balance;
		        }
		        return balance - amount;
		    }

		    static double addInterest(double balance) {
		        // 4% annual interest
		        return balance + (balance * 4 / 100);
		    }

		    static double deductTax(double balance) {
		        // 2% tax on interest
		        return balance - (balance * 2 / 100);
		    }

		    static void printStatement(double opening, double closing) {
		        System.out.println("==============================");
		        System.out.println("       BANK STATEMENT         ");
		        System.out.println("==============================");
		        System.out.println("Opening Balance : Rs." + opening);
		        System.out.println("Closing Balance : Rs." + closing);
		        System.out.println("Net Change      : Rs." + (closing - opening));
		        System.out.println("==============================");
		    }

		    public static void main(String[] args) {
		        double balance = 10000;
		        double opening = balance;

		        balance = deposit(balance, 5000);
		        System.out.println("After Deposit   : Rs." + balance);

		        balance = withdraw(balance, 3000);
		        System.out.println("After Withdraw  : Rs." + balance);

		        balance = addInterest(balance);
		        System.out.println("After Interest  : Rs." + balance);

		        balance = deductTax(balance);
		        System.out.println("After Tax       : Rs." + balance);

		        printStatement(opening, balance);
		    }
		}
		