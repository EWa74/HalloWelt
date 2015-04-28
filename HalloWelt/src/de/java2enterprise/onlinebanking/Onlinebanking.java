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
		
		
		
		if(args.length <2)
		{
			System.out.println("Bitte geben Sie Ihre Benutzerdaten ein!");
			System.exit(-1);
		}
		
		KundeService kundeService = new KundeServiceImpl();
		
		if(kundeService.validate(args[0],  args[1]))
		{
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
		
		/*
		KundeService kundeService = new KundeServiceImpl();
		kundeService.createKunde("schmidt@java2enterprise.de", "Katze#4711");
		*/
	}
} 