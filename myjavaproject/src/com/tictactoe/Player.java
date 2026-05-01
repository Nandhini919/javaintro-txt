package com.tictactoe;

//Parent class: defines what every player HAS and CAN DO
public class Player {

 // Every player has a name and a symbol (X or O)
 String name;
 char symbol;

 // Constructor — sets name and symbol when player is created
 public Player(String name, char symbol) {
     this.name   = name;
     this.symbol = symbol;
 }

 // Every player can introduce themselves
 public void introduce() {
     System.out.println("Player: " + name + " | Symbol: " + symbol);
 }
}