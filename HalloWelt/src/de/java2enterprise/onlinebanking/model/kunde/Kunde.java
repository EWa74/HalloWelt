package de.java2enterprise.onlinebanking.model.kunde;

import de.java2enterprise.onlinebanking.model.konto.Konto;

public abstract class Kunde {
	private Konto konto;
	private Bewertung bewertung;

	public Konto getKonto() {
		return konto;
	}

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
