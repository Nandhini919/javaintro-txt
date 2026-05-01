package com.tictactoe;

//Board class: handles everything related to the grid
public class Board {

 char[][] grid;

 // STEP 1: Initialise the board — fill with '-'
 public Board() {
     grid = new char[3][3];
     for (int r = 0; r < 3; r++)
         for (int c = 0; c < 3; c++)
             grid[r][c] = '-';
 }

 // STEP 2: Print the board
 public void display() {
     System.out.println("  1 2 3");
     for (int r = 0; r < 3; r++) {
         System.out.print((r + 1) + " ");
         System.out.print(grid[r][0] + "|" + grid[r][1] + "|" + grid[r][2]);
         System.out.println();
     }
     System.out.println();
 }

 // Place a symbol on the board
 public void placeSymbol(int row, int col, char symbol) {
     grid[row][col] = symbol;
 }

 // STEP 5: Check if a symbol has won
 public boolean checkWin(char symbol) {

     // Check rows
     for (int r = 0; r < 3; r++) {
         if (grid[r][0] == symbol &&
             grid[r][1] == symbol &&
             grid[r][2] == symbol)
             return true;
     }

     // Check columns
     for (int c = 0; c < 3; c++) {
         if (grid[0][c] == symbol &&
             grid[1][c] == symbol &&
             grid[2][c] == symbol)
             return true;
     }

     // Check diagonals
     if (grid[0][0] == symbol &&
         grid[1][1] == symbol &&
         grid[2][2] == symbol)
         return true;

     if (grid[0][2] == symbol &&
         grid[1][1] == symbol &&
         grid[2][0] == symbol)
         return true;

     return false;
 }

 // STEP 6: Check if board is full (draw)
 public boolean isFull() {
     for (int r = 0; r < 3; r++)
         for (int c = 0; c < 3; c++)
             if (grid[r][c] == '-')
                 return false;
     return true;
 }
}