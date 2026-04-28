package com.opps;

public class BankAccount {
	private double balance;
	void setBalance(double balance){
		if(balance > 0) {
			this.balance = balance;
		}else {
			this.balance = 0;
		}
		
	}
	double getBalance() {
		return balance;
	}

}
