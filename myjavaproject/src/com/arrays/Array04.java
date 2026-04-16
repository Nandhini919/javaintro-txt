package com.arrays;

public class Array04 {

	public static void main(String[] args) {
		System.out.println("Main started");
		int[] numbers= {10};
		System.out.println(numbers);//[I@27716f4
		System.out.println(numbers[0]);//10
		
		int[] numbers1= {10,20,30,40,50};
		
		for(int n:numbers1) {
			if(n%2==0) {
				System.out.println(n);
			}
		}

	}

}
