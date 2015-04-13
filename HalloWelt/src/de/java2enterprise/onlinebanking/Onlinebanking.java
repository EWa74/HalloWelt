package de.java2enterprise.onlinebanking;

import java.util.List;
import java.util.ArrayList;

import de.java2enterprise.onlinebanking.model.kunde.GeschäftsKunde;
import de.java2enterprise.onlinebanking.model.kunde.Kunde;

      
public class Onlinebanking extends Object {

	public static void main(String[] args) {
		
		List<Kunde> bank = new ArrayList<Kunde>();
		bank.add(new GeschäftsKunde(123));
		bank.add(new GeschäftsKunde(456));
		for (Kunde kunde : bank){
			System.out.println(kunde);
		}
		
	}
}
