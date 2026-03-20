package com.logicalstatements01;

import java.util.Scanner;

public class TestLS13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int balance = 5000;
        System.out.println("Enter PIN:");
        int pin = sc.nextInt();

        if (pin == 1234) {
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
            System.out.println("Wrong PIN! Access Denied!");
        }
        sc.close();

	}

}
