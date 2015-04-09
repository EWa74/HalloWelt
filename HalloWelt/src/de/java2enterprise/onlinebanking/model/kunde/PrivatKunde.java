package de.java2enterprise.onlinebanking.model.kunde;

import de.java2enterprise.onlinebanking.model.konto.PrivatKonto;

public class PrivatKunde extends Kunde {
	public PrivatKunde(int nummer){
		super.setKonto(new PrivatKonto(nummer));
	}

	@Override
	public String getAnrede() {
		return "Liebe Kundin, lieber Kunde!";
	}

}
