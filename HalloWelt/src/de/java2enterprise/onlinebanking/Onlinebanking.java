package de.java2enterprise.onlinebanking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Onlinebanking  
{
	public static void main(String[] args) throws Exception 
	{
		/* Treiber in die Laufzeit integrieren: */
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/onlinebanking",
				"app_user",
				"app_user");
		if (con.isValid(10)) 
		{
			System.out.println("Connected!");
		}
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(
				"select id, email, password " +
				"from kunde");
		while (rs.next())
		{
			int id = rs.getInt("id");
			String email = rs.getString("email");
			String password = rs.getString("password");
			
			System.out.println
			(
					id + " : " +
					email  + " : " +
					password
			);				
		}		
	}
}