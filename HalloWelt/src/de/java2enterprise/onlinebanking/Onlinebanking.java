package de.java2enterprise.onlinebanking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import de.java2enterprise.onlinebanking.model.Kunde;


public class Onlinebanking  
{
	public static void main(String[] args) throws Exception 
	{
		/* Treiber in die Laufzeit integrieren: */
		/* Beachte: den Dienst mysqld vom command window ("DOS-Fenster") aus starten */
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
		List<Kunde> list = new ArrayList<Kunde>();
		while (rs.next())
		{
			Kunde kunde =new Kunde();
			kunde.setId(rs.getLong("id"));
			kunde.setEmail(rs.getString("email"));
			kunde.setPassword(rs.getString("password"));
			list.add(kunde);
		}		
		
		for(Kunde kunde :list)
		{
			System.out.println
			(
					kunde.getId() + " : " +
					kunde.getEmail()  + " : " +
					kunde.getPassword()
			);				
		}
	}
}