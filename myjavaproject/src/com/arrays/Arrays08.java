package com.arrays;

public class Arrays08 {

	public static void main(String[] args) {
		// Step 1: Declare numbers array with 3 rows
        int[][] numbers = new int[3][];

        // Step 2: Each row gets a DIFFERENT column size
        numbers[0] = new int[1];   // row 0 → 1 column
        numbers[1] = new int[2];   // row 1 → 2 columns
        numbers[2] = new int[3];   // row 2 → 3 columns

        // Step 3: Assign values
        numbers[0][0] = 1;

        numbers[1][0] = 2;
        numbers[1][1] = 3;

        numbers[2][0] = 4;
        numbers[2][1] = 5;
        numbers[2][2] = 6;
        
        
        
     // Step 4: Print using nested for loop
        System.out.println("Jagged Array:");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {  // numbers[i].length changes per row
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

	}

}
