package com.logicalstatements01;

import java.util.Scanner;

public class TestLs17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        System.out.println("Enter your monthly salary:");
        double salary = sc.nextDouble();
        System.out.println("Do you have existing loan? (yes/no):");
        String loan = sc.next();

        if (age < 21 || age > 60) {
            System.out.println("Not Eligible - Age must be 21-60");
        } else if (salary < 15000) {
            System.out.println("Not Eligible - Salary too low");
        } else if (loan.equalsIgnoreCase("yes")) {
            System.out.println("Not Eligible - Clear existing loan first");
        } else {
            System.out.println("Congratulations! You are Eligible for Loan!");
        }
        sc.close();

	}

}
