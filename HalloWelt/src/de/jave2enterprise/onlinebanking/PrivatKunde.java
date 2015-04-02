package de.jave2enterprise.onlinebanking;

public class PrivatKunde extends Kunde {
	PrivatKunde(int nummer){
		super.setKonto(new PrivatKonto(nummer));
	}

}
