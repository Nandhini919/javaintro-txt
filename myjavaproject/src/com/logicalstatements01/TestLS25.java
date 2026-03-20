package com.logicalstatements01;

import java.util.Scanner;

public class TestLS25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter distance from college (km):");
        int distance = sc.nextInt();
        System.out.println("Enter student percentage:");
        double percentage = sc.nextDouble();
        System.out.println("Any disciplinary issues? (true/false):");
        boolean hasIssues = sc.nextBoolean();

        if (distance > 50) {
            if (percentage >= 60) {
                if (!hasIssues) {
                    System.out.println("Hostel Seat Allotted!");
                } else {
                    System.out.println("Rejected due to Disciplinary Issues!");
                }
            } else {
                System.out.println("Minimum 60% required for Hostel!");
            }
        } else {
            System.out.println("Hostel only for students above 50km distance!");
        }
        sc.close();

	}

}
