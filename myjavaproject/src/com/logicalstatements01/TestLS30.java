package com.logicalstatements01;

import java.util.Scanner;

public class TestLS30 {

	public static void main(String[] args) {
		System.out.println("Cricketer Info!!!");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Jersey no to get details");
		int jno=sc.nextInt();
		
		switch(jno) {
		case 7:
			System.out.println("Thala for a Reason");
			System.out.println("The one and only best and cool captain MS.DHONI");
			break;
			
		case 18:
			System.out.println("The King Kohil");
			System.out.println("The most consistent player");
			break;
			
		case 45:
			System.out.println("The HIT man");
			System.out.println("The good captain and good hitter");
			break;
			default:
				System.out.println("Entered jersey no dtails are not added");
			
		}
		
	}

}
