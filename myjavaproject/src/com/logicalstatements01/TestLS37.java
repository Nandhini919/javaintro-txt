package com.logicalstatements01;

import java.util.Scanner;

public class TestLS37 {

	public static void main(String[] args) {
		System.out.println("Main!!");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Item Code:");
		int itemCode =sc.nextInt();
		switch(itemCode) {
		    case 1 -> System.out.println("Pizza  - ₹299");
		    case 2 -> System.out.println("Burger - ₹149");
		    case 3 -> System.out.println("Pasta  - ₹199");
		    case 4 -> System.out.println("Fries  - ₹99");
		    default -> System.out.println("Item not available in menu!");
		}

	}

}
