package de.java2enterprise.onlinebanking;

import de.java2enterprise.onlinebanking.model.bank.Bank;
import de.java2enterprise.onlinebanking.model.kunde.Gesch�ftsKunde;

      
public class Onlinebanking extends Object {

	public static void main(String[] args) {
		
		Bank<Gesch�ftsKunde> bank = new Bank<Gesch�ftsKunde>();
		Gesch�ftsKunde[] kunden = bank.getE();
		kunden = new Gesch�ftsKunde[1000];
		kunden[0] = new Gesch�ftsKunde(123);
		System.out.println(kunden[0]);
		
	}
}
