package de.jave2enterprise.onlinebanking;

import de.jave2enterprise.onlinebanking.authorization.Authorization;
import de.jave2enterprise.onlinebanking.authorization.AuthorizationException;
import de.jave2enterprise.onlinebanking.model.kunde.GeschäftsKunde;

      
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
