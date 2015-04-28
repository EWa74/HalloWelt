package de.java2enterprise.onlinebanking.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import de.java2enterprise.onlinebanking.model.Kunde;

public interface KundeService {

	public abstract List<Kunde> getKunden() throws ClassNotFoundException,
			SQLException, FileNotFoundException, IOException;
	
	public abstract boolean validate(String email, String password) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException;
	
	public abstract void createKunde(String email, String password) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException;
}