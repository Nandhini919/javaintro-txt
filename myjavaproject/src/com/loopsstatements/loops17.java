package com.loopsstatements;

import java.util.Scanner;

public class loops17 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting number:");
        int start = sc.nextInt();
        System.out.println("Enter the ending number:");
        int end = sc.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + ":");

        for (int i = start; i <= end; i++) {
            boolean isPrime = true;

            if (i < 2) {               // 0 and 1 are not prime
                isPrime = false;
            }

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        sc.close();
    }

}
