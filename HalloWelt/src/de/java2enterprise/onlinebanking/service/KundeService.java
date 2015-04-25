package de.java2enterprise.onlinebanking.service;

import java.sql.SQLException;
import java.util.List;

import de.java2enterprise.onlinebanking.model.Kunde;

public interface KundeService {

	public abstract List<Kunde> getKunden() throws ClassNotFoundException,
			SQLException;

}