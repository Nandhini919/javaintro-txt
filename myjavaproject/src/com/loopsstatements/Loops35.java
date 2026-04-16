package com.loopsstatements;
import java.util.Scanner;
public class Loops35 {
 // Step 1: Method to compute sum of digits
	    static int sumOfDigits(int n) {
	        int sum = 0;
	        while (n > 0) {
	            sum += n % 10;   // extract last digit and add
	            n /= 10;         // remove last digit
	        }
	        return sum;
	    }

	    // Step 2: Method to check if magic number
	    static boolean isMagicNumber(int n) {
	        // Keep summing digits until we get a single digit
	        while (n >= 10) {
	            n = sumOfDigits(n);
	        }
	        return n == 1;  // Magic if final result is 1
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        // Step 3: Print digit-sum trace
	        int temp = num;
	        System.out.println("*********************************8");
	        while (temp >= 10) {
	            int sum = sumOfDigits(temp);
	            System.out.println("Sum of digits of " + temp + " = " + sum);
	            temp = sum;
	        }

	        // Step 4: Print result
	        if (isMagicNumber(num)) {
	            System.out.println("\n" + num + " is a Magic Number ✓");
	        } else {
	            System.out.println("\n" + num + " is NOT a Magic Number ✗");
	        }

	        sc.close();
	    }
	}