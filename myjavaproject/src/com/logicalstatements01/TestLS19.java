package com.logicalstatements01;

import java.util.Scanner;

public class TestLS19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        if (num % 2 == 0 && num % 3 == 0 && num % 5 == 0) {
            System.out.println("Divisible by 2, 3 and 5");
        } else if (num % 2 == 0 && num % 3 == 0) {
            System.out.println("Divisible by 2 and 3");
        } else if (num % 2 == 0 && num % 5 == 0) {
            System.out.println("Divisible by 2 and 5");
        } else if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("Divisible by 3 and 5");
        } else if (num % 2 == 0) {
            System.out.println("Divisible by 2 only");
        } else if (num % 3 == 0) {
            System.out.println("Divisible by 3 only");
        } else if (num % 5 == 0) {
            System.out.println("Divisible by 5 only");
        } else {
            System.out.println("Not divisible by 2, 3 or 5");
        }
        sc.close();

	}

}
