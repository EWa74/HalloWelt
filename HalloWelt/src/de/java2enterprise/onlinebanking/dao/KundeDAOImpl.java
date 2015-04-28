package de.java2enterprise.onlinebanking.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import de.java2enterprise.onlinebanking.model.Kunde;

public class KundeDAOImpl implements KundeDAO
{

	@Override
	public List<Kunde> getKunden() throws ClassNotFoundException, SQLException, FileNotFoundException, IOException 
	{
		
		Connection con = DataAccess.getConnection();
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
		return list;
	}

	@Override
	public Kunde getKunde(String email, String password) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		
		Connection con = DataAccess.getConnection();
		java.sql.PreparedStatement stmt = con.prepareStatement(
				"select id, email, password " +
				"from kunde " +
				"where email =  ?" +
				"and password = ?");
		stmt.setString(1,  email);
		stmt.setString(2,  password);		
		ResultSet rs = stmt.executeQuery();
		
		Kunde kunde = null;
		if(rs.next())
		{
			kunde =new Kunde();
			kunde.setId(rs.getLong("id"));
			kunde.setEmail(rs.getString("email"));
			kunde.setPassword(rs.getString("password"));

		}	
		return kunde;
		
	}

	@Override
	public void createKunde(String email, String password) 
			throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		Connection con = DataAccess.getConnection();
		java.sql.PreparedStatement stmt = con.prepareStatement(
				"insert into kunde (email, password) " +
				"values(?, ?)");
		stmt.setString(1,  email);
		stmt.setString(2,  password);		
		stmt.execute();
		
	}

}
