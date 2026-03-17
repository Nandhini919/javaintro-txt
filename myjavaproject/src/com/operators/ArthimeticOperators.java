package com.operators;

import java.util.Scanner;

public class ArthimeticOperators {

	public static void main(String[] args) {
		System.out.println("Main!!!!!!!!!!!!!!");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int a=sc.nextInt();
		System.out.println("Enter b Number:");
		int b=sc.nextInt();
		System.out.println("Addition of:"+(a+b));
		System.out.println("Subtraction of:"+(a-b));
		System.out.println("Multiplication of:"+(a*b));
		System.out.println("Division of:"+(a/b));
		System.out.println("Modulus of:"+(a%b));

	}

}
