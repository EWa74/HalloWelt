package de.jave2enterprise.onlinebanking;

public class GeschäftsKunde extends Kunde {
	GeschäftsKunde(int nummer){
		super.setKonto(new GeschäftsKonto(nummer));
	}

}
