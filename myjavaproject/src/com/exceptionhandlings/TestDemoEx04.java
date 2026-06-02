package com.exceptionhandlings;

public class TestDemoEx04 {

	public static void main(String[] args) {
		System.out.println("Main started");
		
		int[] arr = null;
		
		try {
			arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		}catch(Exception e) {
			e.printStackTrace();
		}
		for(int a : arr) {
			System.out.println(a);
			
		}
		System.out.println("Main Ended");
	}

}
