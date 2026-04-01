package com.loopsstatements;

public class Loops03 {

	public static void main(String[] args) {
		System.out.println("Main!");
		System.out.println("Even Numbers:");
		for(int i = 0;i <= 100; i++) {
			if(i % 2 == 0 && i!=0) {
			System.out.print(i + "  ");
	 }
		}
		System.out.println("***********************************");
		System.out.println("Odd Numbers:");
		for(int i = 0;i <= 100; i++) {
			if(i % 2 == 1 && i!=0) {
			System.out.print(i + "  ");
	 }
		}
			
	}

}
