package de.jave2enterprise.onlinebanking;

public class Gesch�ftsKunde extends Kunde {
	Gesch�ftsKunde(int nummer){
		super.setKonto(new Gesch�ftsKonto(nummer));
	}

}
