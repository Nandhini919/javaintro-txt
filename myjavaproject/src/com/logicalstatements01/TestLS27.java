package com.logicalstatements01;

import java.util.Scanner;

public class TestLS27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter family annual income:");
        double income = sc.nextDouble();
        System.out.println("Enter student percentage:");
        double percentage = sc.nextDouble();
        System.out.println("Is student differently abled? (true/false):");
        boolean isDifferentlyAbled = sc.nextBoolean();

        if (income < 200000) {
            if (percentage >= 75) {
                System.out.println("Full Scholarship Granted!");
            } else if (percentage >= 60) {
                System.out.println("50% Scholarship Granted!");
            } else {
                System.out.println("Not Eligible - Low Percentage");
            }
        } else if (isDifferentlyAbled) {
            if (percentage >= 50) {
                System.out.println("Special Scholarship for Differently Abled!");
            } else {
                System.out.println("Minimum 50% required!");
            }
        } else {
            System.out.println("Income too high for scholarship!");
        }
        sc.close();
	}

}
