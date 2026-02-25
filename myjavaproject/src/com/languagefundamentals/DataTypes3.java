package com.languagefundamentals;
import java.math.BigInteger;
import java.math.BigDecimal;
public class DataTypes3 {
	// Type mismatch: integer cannot convert to big integer
	// BigInteger bi=100;
	// BigDecimal bd=200;
	
	

	
	
	
	
	BigInteger bi = new BigInteger("1000000001234556789");
	BigInteger bii = new BigInteger("1000000001234556789");
	
	BigDecimal bd= new BigDecimal("908765654321875876359376.4754599674948095750983083");
	BigDecimal bdd= new BigDecimal("908765654321875876359376.4754599674948095750983083");

	public static void main(String[] args) {
		System.out.println("main started !!");
		
		DataTypes3 dt=new DataTypes3();
		
		
		
		
		System.out.println("---------------------------");
		System.out.println(dt.bi);
		System.out.println(dt.bii);
		
		// + is undefined for argument type(s)
		System.out.println(dt.bi.add(dt.bii));
		System.out.println(dt.bi.multiply(dt.bii));
		System.out.println(dt.bi.mod(dt.bii));
		System.out.println(dt.bi.divide(dt.bii));
		
		
		System.out.println(dt.bd.add(dt.bdd));
		System.out.println(dt.bd.multiply(dt.bdd));
		System.out.println(dt.bd.divide(dt.bdd));
		
		
		
	}

}
