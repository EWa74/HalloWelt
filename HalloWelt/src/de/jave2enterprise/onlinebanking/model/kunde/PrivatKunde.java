package de.jave2enterprise.onlinebanking.model.kunde;

import de.jave2enterprise.onlinebanking.model.konto.PrivatKonto;

public class PrivatKunde extends Kunde {
	public PrivatKunde(int nummer){
		super.setKonto(new PrivatKonto(nummer));
	}

	@Override
	public String getAnrede() {
		return "Liebe Kundin, lieber Kunde!";
	}

}
