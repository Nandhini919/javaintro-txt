package com.tictactoe;

import java.util.Scanner;

//Child class: INHERITS from Player, ADDS keyboard input ability
public class HumanPlayer extends Player {

 Scanner scanner;

 // Call parent constructor using super()
 public HumanPlayer(String name, char symbol, Scanner scanner) {
     super(name, symbol);   // sends name & symbol up to Player
     this.scanner = scanner;
 }

 // STEP 3 & 4: Ask user for row and column — validate the input
 public int[] getMove(char[][] board) {

     int row, col;

     while (true) {

         System.out.println(name + ", enter row (1-3):");
         row = scanner.nextInt() - 1;   // convert 1-3 → 0-2

         System.out.println(name + ", enter column (1-3):");
         col = scanner.nextInt() - 1;

         // Check bounds
         if (row < 0 || row > 2 || col < 0 || col > 2) {
             System.out.println("Out of range! Enter 1, 2, or 3 only.");
         }
         // Check if cell is already taken
         else if (board[row][col] != '-') {
             System.out.println("Cell taken! Pick an empty cell.");
         }
         // Valid move
         else {
             return new int[]{row, col};   // return position as array
         }
     }
 }

 // OVERRIDE introduce() to add extra info for human players
 @Override
 public void introduce() {
     super.introduce();   // call parent's introduce() first
     System.out.println("  → Human player (keyboard input)");
 }
}