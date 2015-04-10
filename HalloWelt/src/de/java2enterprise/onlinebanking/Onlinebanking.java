package de.java2enterprise.onlinebanking;

import de.java2enterprise.onlinebanking.model.bank.Bank;
import de.java2enterprise.onlinebanking.model.kunde.GeschäftsKunde;

      
public class Onlinebanking extends Object {

	public static void main(String[] args) {
		
		Bank<GeschäftsKunde> bank = new Bank<GeschäftsKunde>();
		GeschäftsKunde[] kunden = bank.getE();
		kunden = new GeschäftsKunde[1000];
		kunden[0] = new GeschäftsKunde(123);
		System.out.println(kunden[0]);
		
	}
}
