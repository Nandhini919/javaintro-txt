package com.logicalstatements01;

import java.util.Scanner;

public class TestLS15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password:");
        String pass = sc.next();
        int len = pass.length();

        if (len < 6) {
            System.out.println("Weak Password! - Less than 6 characters");
        } else if (len >= 6 && len <= 8) {
            System.out.println("Medium Password - Try adding more characters");
        } else if (len >= 9 && len <= 12) {
            System.out.println("Strong Password!");
        } else {
            System.out.println("Very Strong Password!");
        }
        sc.close();

	}

}
