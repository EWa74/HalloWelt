package de.java2enterprise.onlinebanking.dao;

import java.sql.SQLException;
import java.util.List;

import de.java2enterprise.onlinebanking.model.Kunde;

public interface KundeDAO 
{
	public abstract List<Kunde> getKunden() throws ClassNotFoundException, SQLException; 
}
