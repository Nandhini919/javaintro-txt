package com.arrays;

public class Arrays09 {

	public static void main(String[] args) {
		System.out.println("Main method Started!!!!!!!");
		int[] arr = {1, 2, 3, 4, 2, 3, 1, 5, 6, 7};
		
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.print(arr[i] + " ");
				}
			}
		}
	}

}
