package de.java2enterprise.onlinebanking.service;

import java.sql.SQLException;
import java.util.List;

import de.java2enterprise.onlinebanking.dao.KundeDAO;
import de.java2enterprise.onlinebanking.dao.KundeDAOImpl;
import de.java2enterprise.onlinebanking.model.Kunde;

public class KundeServiceImpl implements KundeService {
	/* (non-Javadoc)
	 * @see de.java2enterprise.onlinebanking.service.KundeService#getKunden()
	 */
	@Override
	public List<Kunde> getKunden() throws ClassNotFoundException, SQLException
	{
		KundeDAO kundeDAO = new KundeDAOImpl();
		return kundeDAO.getKunden();
	}

}
