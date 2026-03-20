package com.logicalstatements01;

import java.util.Scanner;

public class TestLS22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter purchase amount:");
        double amount = sc.nextDouble();
        System.out.println("Are you a Premium member? (true/false):");
        boolean isPremium = sc.nextBoolean();

        if (amount > 0) {
            if (isPremium) {
                if (amount >= 5000) {
                    System.out.println("30% Discount! Pay: Rs." + (amount * 0.70));
                } else if (amount >= 2000) {
                    System.out.println("20% Discount! Pay: Rs." + (amount * 0.80));
                } else {
                    System.out.println("10% Discount! Pay: Rs." + (amount * 0.90));
                }
            } else {
                if (amount >= 5000) {
                    System.out.println("10% Discount! Pay: Rs." + (amount * 0.90));
                } else {
                    System.out.println("No Discount. Pay Full: Rs." + amount);
                }
            }
        } else {
            System.out.println("Invalid Amount!");
        }
        sc.close();
	}

}
