package com.starpatterns;

public class StarPatterns25 {

    public static void main(String[] args) {
        
        char[][] grid = new char[5][5];
        char ch = 'A';

        // Step 1: Fill non-diagonal, non-antidiagonal positions sequentially (A–P)
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                if (i != j && i + j != 5 - 1)
                    grid[i][j] = ch++;

        // Step 2: Fill X (diagonal + antidiagonal) positions
        for (int i = 0; i < 5; i++) {
            if (i < 5 / 2) {
                // Top half: main diagonal = one row below; antidiag = 2 columns left
                grid[i][i]         = grid[i + 1][i];
                grid[i][5 - 1 - i] = grid[i][5 - 3 - i];
            } else if (i == 5 / 2) {
                // Center: copy from last row, same column
                grid[i][i] = grid[5 - 1][i];
            } else {
                // Bottom half: both X positions share value from next row's inner col
                int innerCol = Math.min(i, 5 - 1 - i);
                char val = (i + 1 < 5) ? grid[i + 1][innerCol]
                                       : grid[5 / 2][5 / 2 + 1];
                grid[i][i]         = val;
                grid[i][5 - 1 - i] = val;
            }
        }

        // Step 3: Print
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++)
                System.out.print(grid[i][j] + " ");
            System.out.println();
        }
    }
}
