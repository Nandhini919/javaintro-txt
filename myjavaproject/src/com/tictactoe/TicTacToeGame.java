package com.tictactoe;

import java.util.Scanner;

//Child class: INHERITS from Game, implements full TicTacToe logic
public class TicTacToeGame extends Game {

 Board board;
 HumanPlayer player1;
 HumanPlayer player2;
 HumanPlayer currentPlayer;

 public TicTacToeGame() {
     super("Tic Tac Toe");   // send title to parent Game class

     Scanner scanner = new Scanner(System.in);

     // Create two human players
     player1 = new HumanPlayer("Player X", 'X', scanner);
     player2 = new HumanPlayer("Player O", 'O', scanner);

     // Create the board
     board = new Board();   // Step 1: board initialised here

     // X goes first
     currentPlayer = player1;
 }

 // STEP 7: Switch between player1 and player2
 public void switchPlayer() {
     if (currentPlayer == player1) {
         currentPlayer = player2;
     } else {
         currentPlayer = player1;
     }
 }

 // OVERRIDE start() from parent Game class
 @Override
 public void start() {
     super.start();   // print the title from parent

     // Introduce both players
     player1.introduce();
     player2.introduce();
     System.out.println();

     // Step 2: show empty board
     board.display();

     // Game loop
     while (true) {

         // Step 3 & 4: get valid move from current player
         int[] move = currentPlayer.getMove(board.grid);
         int row = move[0];
         int col = move[1];

         // Place the symbol on the board
         board.placeSymbol(row, col, currentPlayer.symbol);

         // Step 2: show updated board
         board.display();

         // Step 5: check if current player won
         if (board.checkWin(currentPlayer.symbol)) {
             end(currentPlayer.name + " wins! Congratulations!");
             break;
         }

         // Step 6: check if board is full
         if (board.isFull()) {
             end("It's a draw!");
             break;
         }

         // Step 7: give turn to the other player
         switchPlayer();
     }
 }
}