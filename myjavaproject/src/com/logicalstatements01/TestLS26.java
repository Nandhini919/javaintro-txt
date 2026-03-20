package com.logicalstatements01;

import java.util.Scanner;

public class TestLS26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter mobile number (10 digits check):");
        String mobile = sc.next();
        System.out.println("Enter recharge amount:");
        int amount = sc.nextInt();

        if (mobile.length() == 10) {
            if (amount == 149) {
                System.out.println("Plan: 1GB/day | 28 days | Unlimited calls");
            } else if (amount == 249) {
                System.out.println("Plan: 2GB/day | 28 days | Unlimited calls");
            } else if (amount == 599) {
                System.out.println("Plan: 3GB/day | 84 days | Unlimited calls");
            } else {
                System.out.println("No plan found for Rs." + amount);
            }
        } else {
            System.out.println("Invalid Mobile Number!");
        }
        sc.close();
	}

}
