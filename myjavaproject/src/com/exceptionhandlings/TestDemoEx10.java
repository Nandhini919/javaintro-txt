package com.exceptionhandlings;

public class TestDemoEx10 {
//in java,the try and finally is possible just for closing the resources and connections
//but not for graceful termination of the code
//if the code should be grace ful termination means ,we should use catch block
//without catch block we can't except grace ful termination if something went wrong in your code
	public static void main(String[] args) {
		System.out.println("Main started");
		
		try {
			System.out.println("In try");
			System.out.println(10/0);
		}catch(ArithmeticException e) {
			System.out.println("In catch AE");
			}
		catch(Exception e) {
			System.out.println("In catch E");
			}
		finally {
			System.out.println("In finally");
			}
		
//we cannot write finally multiples times 		
//		finally {
//			System.out.println("In finally");
//			}
		
		
		
//we can't write here after finally .we must follow the order 
//try-catch-finally
		
//		catch(Exception e) {
//			System.out.println("in catch");
//		}
		System.out.println("Main Ended");
	}

}
