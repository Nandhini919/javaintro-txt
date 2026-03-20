package com.logicalstatements01;

import java.util.Scanner;

public class TestLS20 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int balance = 10000;

	        System.out.println("Enter account number:");
	        int accNo = sc.nextInt();
	        System.out.println("Enter PIN:");
	        int pin = sc.nextInt();

	        if (accNo == 123456) {
	            if (pin == 9999) {
	                System.out.println("Login Successful!");
	                System.out.println("Enter amount to withdraw:");
	                int amount = sc.nextInt();
	                if (amount <= 0) {
	                    System.out.println("Invalid Amount!");
	                } else if (amount > balance) {
	                    System.out.println("Insufficient Balance!");
	                } else {
	                    balance -= amount;
	                    System.out.println("Withdrawal Successful!");
	                    System.out.println("Remaining Balance: Rs." + balance);
	                }
	            } else {
	                System.out.println("Wrong PIN!");
	            }
	        } else {
	            System.out.println("Account Not Found!");
	        }
	        sc.close();

	}

}
