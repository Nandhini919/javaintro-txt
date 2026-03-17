package com.languagefundamentals.constructor;
//Gun class (Parent)
class Gun {

 Gun() {
     System.out.println("Gun Created"); 
 }

 void start() {
     System.out.println("Gun Starting");      
 }
}


//Bullet class (Child)
class Bullet extends Gun {

 Bullet() {
     super();
     }                             

 @Override
 void start() {
     System.out.println("Bullet Starting");   
     super.start();                           
 }
}


//Main class
public class Task2 {
 public static void main(String[] args) {
     Bullet b = new Bullet();
     b.start();
 }
}
