package com.arrays;

public class Arrays22 {

	public static void main(String[] args) {
        int[][] matrix = { {1, 2, 3}, {4, 5, 6} };
        
        int rows = matrix.length;
        int columns = matrix[0].length;

        // Initialize transpose matrix with swapped dimensions (3 rows, 2 columns)
        int[][] transpose = new int[columns][rows];

        // Core logic: swapping rows and columns
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Print Output
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();

}
}
}
