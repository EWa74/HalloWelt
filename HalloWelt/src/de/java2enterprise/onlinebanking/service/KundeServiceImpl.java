package de.java2enterprise.onlinebanking.service;

import java.io.FileNotFoundException;
import java.io.IOException;
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
	public List<Kunde> getKunden() throws ClassNotFoundException, SQLException, FileNotFoundException, IOException
	{
		KundeDAO kundeDAO = new KundeDAOImpl();
		return kundeDAO.getKunden();
	}

	@Override
	public boolean validate(String email, String password) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		KundeDAO kundeDAO = new KundeDAOImpl();
		Kunde kunde = kundeDAO.getKunden(email, password);
		if(kunde !=null)
		{
			return true;
		}
		return false;
	}

}
