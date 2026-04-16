package com.arrays;

import java.util.Scanner;

public class Arrays03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an Array:");
		int size=sc.nextInt();
		String[] names=new String[size];
		
		names[0]="Nandhu";
		names[1]="Vamsi";
		names[3]="Harsha";
		names[4]="Jaya";
		names[5]="Dinesh";
		
		for(int i=0;i < size;i++) {
			System.out.println(names[i]);
		}

	}

}
