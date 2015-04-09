package de.java2enterprise.onlinebanking;

import de.java2enterprise.onlinebanking.authorization.Authorization;
import de.java2enterprise.onlinebanking.authorization.AuthorizationException;
import de.java2enterprise.onlinebanking.model.kunde.GeschäftsKunde;

      
public class Onlinebanking extends Object {

	public static void main(String[] args) {
		
		try {
			Authorization.check("admin", "admin");
		} catch (AuthorizationException e) {
			e.printStackTrace();
		}
		
		System.out.println(new GeschäftsKunde(Integer.valueOf(123)));
	}
}
