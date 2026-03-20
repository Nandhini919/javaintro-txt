package com.logicalstatements01;

import java.util.Scanner;

public class TestLS23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter child's age:");
        int age = sc.nextInt();
        System.out.println("Enter entrance test score (out of 100):");
        int score = sc.nextInt();
        System.out.println("Is the child from this district? (true/false):");
        boolean isLocal = sc.nextBoolean();

        if (age >= 5 && age <= 15) {
            if (score >= 60) {
                if (isLocal) {
                    System.out.println("Admitted with Local Quota Benefit!");
                } else {
                    System.out.println("Admitted under General Category!");
                }
            } else if (score >= 40) {
                System.out.println("Waitlisted - Score is Average");
            } else {
                System.out.println("Not Admitted - Score Too Low");
            }
        } else {
            System.out.println("Age not eligible for admission!");
        }
        sc.close();

	}

}
