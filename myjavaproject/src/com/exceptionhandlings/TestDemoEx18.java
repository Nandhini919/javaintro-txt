package com.exceptionhandlings;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDemoEx18 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("Main Started");
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("loaded successfully");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdata","root","nandhureddy_20");
		System.out.println("Connection established");
		
	    st = con.createStatement();
		
		String sql = "select * from employee" ;
		 rs = st.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getInt(4));
			System.out.println("***********");
			
		}
		}finally {
			rs.close();
			st.close();
			con.close();
		}
		
	}

}
