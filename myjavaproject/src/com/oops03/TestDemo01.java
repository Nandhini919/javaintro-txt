package com.oops03;

public class TestDemo01 {
   static String welcome() {
	 return "Good Afternoon";
	 
 }
   static String welcome(String str) {
		 return str;
		 
	 }
	   
   
 //Duplicate method welcome() in type TestDemo01
//   Object welcome() { 
//	   return "Good Evening";
//   }
  public static void main (String[] args) {
	   System.out.println("Main!!");
	   System.out.println(welcome());
	   System.out.println(welcome("Fucking day"));
   }
}
