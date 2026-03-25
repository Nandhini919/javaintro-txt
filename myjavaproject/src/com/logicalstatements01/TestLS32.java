package com.logicalstatements01;

import java.util.Scanner;

public class TestLS32 {

	public static void main(String[] args) {
		System.out.println("Main!!");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter A number");
		int a=sc.nextInt();
		
		System.out.println("Enter B number");
		int b=sc.nextInt();
		
		System.out.println("Enter a symbol to proceed for caluclation:");
		String symb=sc.next();
		
		switch(symb) {
		case "+" -> 
		{
			System.out.println("Addition:");
			System.out.println(a+b);
		}
		case "-" -> 
		{
			System.out.println("Subtraction:");
			System.out.println(a-b);
		}
		case "*" -> 
		{
			System.out.println("Multiplication:");
			System.out.println(a*b);
		}
		case "/" ->
		{
			System.out.println("Division:");
			System.out.println(a/b);
		}
		case "%" ->
		{
			System.out.println("Modulus:");
			System.out.println(a%b);
		}
		default -> System.out.println("Enteted a invalid Symbol");
		
		}
	}

}
