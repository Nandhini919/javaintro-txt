package com.arrays;

public class SelectionSortAlgorithm {

	public static void main(String[] args) {
		System.out.println("Main Started!!!!!!!!");
		int[] arr= {45,18,9,7,8,1,4};
		int temp=0;
		
		
		for(int i = 0; i < arr.length-1; i++) {
			int minIndex = i;
			
			for(int j = i+1; j < arr.length; j++) {
				
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}	
			temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
			
		}
		System.out.println("After Sorting:");
		for (int a : arr) {
            System.out.print(a + " ");
        }

	}

}
