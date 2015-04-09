package de.java2enterprise.onlinebanking.model.bank;

import de.java2enterprise.onlinebanking.model.kunde.Kunde;
 
public final class Bank implements BankInterface {

	private Kunde[] kunden = new Kunde[INITIALE_ANZAHL];

	public Kunde[] getKunden() {
		return kunden;
	}

	public void setKunden(Kunde[] kunden) {
		this.kunden = kunden;
	}
}
