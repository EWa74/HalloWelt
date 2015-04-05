package de.jave2enterprise.onlinebanking.model.kunde;

import de.jave2enterprise.onlinebanking.model.konto.GeschäftsKonto;

public class GeschäftsKunde extends Kunde {
	public GeschäftsKunde(int nummer){
		super.setKonto(new GeschäftsKonto(nummer));
	}

	@Override
	public String getAnrede() {
		return "Sehr geehrte DAmen und Herren!";
	}

}
