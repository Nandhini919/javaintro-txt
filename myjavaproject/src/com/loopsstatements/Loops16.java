package com.loopsstatements;

import java.util.Scanner;

public class Loops16 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number:");
	int n=sc.nextInt();
        
        int sumEven = 0, sumOdd = 0;
        int countEven = 0, countOdd = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sumEven += i;
                countEven++;
            } else {
                sumOdd += i;
                countOdd++;
            }
        }

        System.out.println("Sum of Even numbers   : " + sumEven);
        System.out.println("Sum of Odd numbers    : " + sumOdd);
        System.out.println("Count of Even numbers : " + countEven);
        System.out.println("Count of Odd numbers  : " + countOdd);
        sc.close();
    }

}
