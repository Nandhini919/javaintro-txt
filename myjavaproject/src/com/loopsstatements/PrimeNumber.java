package com.loopsstatements;

import java.util.Scanner;

public class PrimeNumber {

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting of range: ");
        int start = sc.nextInt();

        System.out.print("Enter ending of range  : ");
        int end   = sc.nextInt();

        int[] primes = new int[5];
        int  count  = 0;
        int  sum    = 0;

        for (int i = start; i <= end && count < 5; i++) {
            if (isPrime(i)) {
                primes[count++] = i;
                sum += i;
            }
        }

        if (count < 5) {
            System.out.println(
              "Less than 5 primes found in range.");
            return;
        }

        System.out.print("Primes: ");
        for (int p : primes)
            System.out.print(p + " ");

        System.out.println();
        System.out.println("Sum: " + sum);
        System.out.println("Sum of prime numbers is "
            + (sum % 2 == 0 ? "Even" : "Odd"));

        sc.close();
    }
}