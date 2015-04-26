package de.java2enterprise.onlinebanking.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import de.java2enterprise.onlinebanking.model.Kunde;

public interface KundeDAO 
{
	public abstract List<Kunde> getKunden() throws ClassNotFoundException, SQLException, FileNotFoundException, IOException;

	public abstract Kunde getKunden(String email, String password) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException; 
}
