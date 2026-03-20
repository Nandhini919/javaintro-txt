package com.operators;

import java.util.Scanner;

public class BitwiseOperators1 {

	public static void main(String[] args) {
		System.out.println("Main!!!!!!");
		
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        
        if ((num & 1) == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }

        sc.close();
		
	}

}
