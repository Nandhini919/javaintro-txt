package com.arrays;

public class Arrays23 {

	
	public static void main(String[] args) {
		
		       int[][] matrix = {{1, 2, 3},{4, 5, 6}, {7, 8, 9}};
		       int temp=0;

		        int rows = matrix.length;
		        int cols = matrix[0].length;

		        for (int i = 0; i < rows; i++) {
		            matrix[i][i] = matrix[i][i] * matrix[i][i];
		            if (i % 2 == 0) {
		                int left = 0;
		                int right = cols - 1;
		                while (left < right) {
		                    temp = matrix[i][left];
		                    matrix[i][left] = matrix[i][right];
		                    matrix[i][right] = temp;
		                    left++;
		                    right--;
		                }
		            }

		            else {
		                for (int j = 0; j < cols; j++) {
		                    matrix[i][j] = matrix[i][j] * 2;
		                }
		            }
		        }

		        System.out.println("Matrix is:");
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < cols; j++) {
		                System.out.print(matrix[i][j] + " ");
		            }
		            System.out.println();
		        }
		    }
		


		

	}


