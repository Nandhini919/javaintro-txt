package com.exceptionhandlings;

public class TestDemoEx06 {

	public static void main(String[] args) {
		System.out.println("Main started");
		
		
        try {
        	System.out.println("in Try");
		String s = "Nandhu";
		int x  = s.indexOf('a');
		System.out.println(x);
		System.out.println(10/x);
		System.out.println("Hello");
        }
        //Unreachable catch block for NullPointerException. 
        //It is already handled by the catch block for Exception
        catch(NullPointerException e) {
        	System.out.println("In Catch NP");
        	e.printStackTrace();
        }catch(ArithmeticException e) {
        	System.out.println("In Catch AE");
        	e.printStackTrace();
        }catch(Exception e) {
        	System.out.println("In Catch E");
        	e.printStackTrace();
        }
        
		
		
		System.out.println("Main Ended");

	}

}
