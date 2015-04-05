package de.jave2enterprise.onlinebanking.model.kunde;

import de.jave2enterprise.onlinebanking.model.konto.Gesch�ftsKonto;

public class Gesch�ftsKunde extends Kunde {
	public Gesch�ftsKunde(int nummer){
		super.setKonto(new Gesch�ftsKonto(nummer));
	}

	@Override
	public String getAnrede() {
		return "Sehr geehrte DAmen und Herren!";
	}

}
