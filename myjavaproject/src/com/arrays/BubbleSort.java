package com.arrays;
//WAP to print the array in sorting order using bubble sort.
//time complexity:o(n^2)  o(n)
//space complexity:o(1)
public class BubbleSort {

	public static void main(String[] args) {
		System.out.println("Main Started!!!!!!!!");
		
		int[] arr= {30, 40, 20, 15, 5, 2};
		int temp = 0;
		int count=0;
		int count1=0;
		
		//rotation -1:
		//30 40 20 15 5 2
		//30 20 40 15 5 2
		//30 20 15 40 5 2
		//30 20 15 5 40 2
		//30 20 15 5 2 40
		System.out.println("Sorted Array Before Sort:");
		for(int a:arr) {
			System.out.print(a+" ");
		}
		System.out.println();
		
			
		
		
		for (int i = 0; i < arr.length - 1; i++) {
			count++;
			boolean swapped=false;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp ;
					swapped=true;
				}
				count1++;
			}
			if(!swapped) {
				break;
			}
			
		}
		System.out.println("Sorted Array After Sort:");
		for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();

	}

}
