package com.logicalstatements01;

import java.util.Scanner;

public class TestLS11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter operator (+, -, *, /):");
        char op = sc.next().charAt(0);

        if (op == '+') {
            System.out.println("Result: " + (a + b));
        } else if (op == '-') {
            System.out.println("Result: " + (a - b));
        } else if (op == '*') {
            System.out.println("Result: " + (a * b));
        } else if (op == '/') {
            if (b == 0) {
                System.out.println("Cannot divide by Zero!");
            } else {
                System.out.println("Result: " + (a / b));
            }
        } else {
            System.out.println("Invalid Operator!");
        }
        sc.close();

	}

}
