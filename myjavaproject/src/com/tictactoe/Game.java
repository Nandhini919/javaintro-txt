package com.tictactoe;

//Parent Game class: defines the basic structure of any game
public class Game {

 String title;

 public Game(String title) {
     this.title = title;
 }

 // Every game can start — child classes will override this
 public void start() {
     System.out.println("=== " + title + " ===");
 }

 // Every game ends
 public void end(String message) {
     System.out.println(message);
     System.out.println("Thanks for playing " + title + "!");
 }
}