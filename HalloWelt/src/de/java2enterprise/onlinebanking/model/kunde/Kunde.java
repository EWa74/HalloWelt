package de.java2enterprise.onlinebanking.model.kunde;

import java.io.Serializable;

import de.java2enterprise.onlinebanking.model.konto.GeschäftsInterface;
import de.java2enterprise.onlinebanking.model.konto.Konto;

public abstract class Kunde implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2036159493410920088L;
	/* private Konto konto; */
	private GeschäftsInterface konto;
	private Bewertung bewertung;

	/* 
	public Konto getKonto() {
	
		return konto;
	} 
	*/
	

	public void setKonto(Konto konto) {
		this.konto = konto;
	}
	
	public abstract String getAnrede();

	@Override
	public String toString() {
		return "Kunde [konto=" + konto + "]";
	}

	public Bewertung getBewertung() {
		return bewertung;
	}

	public void setBewertung(Bewertung bewertung) {
		this.bewertung = bewertung;
	}
}
