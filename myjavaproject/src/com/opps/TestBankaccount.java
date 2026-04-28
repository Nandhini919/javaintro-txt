package com.opps;

public class TestBankaccount {

	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
//		ba.balance = 100;
//		System.out.println(ba.balance);
		ba.setBalance(1000);
		System.out.println(ba.getBalance());

	}

}
