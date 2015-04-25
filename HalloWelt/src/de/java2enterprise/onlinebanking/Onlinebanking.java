package de.java2enterprise.onlinebanking;

import de.java2enterprise.onlinebanking.model.Kunde;
import de.java2enterprise.onlinebanking.service.KundeService;
import de.java2enterprise.onlinebanking.service.KundeServiceImpl;


public class Onlinebanking  
{
	public static void main(String[] args) throws Exception 
	{
		/* Treiber in die Laufzeit integrieren: */
		/* Beachte: den Dienst mysqld vom command window ("DOS-Fenster") aus starten */
			
		KundeService kundeService = new KundeServiceImpl();
		for(Kunde kunde :kundeService.getKunden())
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