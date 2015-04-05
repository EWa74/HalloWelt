package de.jave2enterprise.onlinebanking.model.konto;


public class GeschäftsKonto extends Konto {
	public static int anzahl;
	
	public GeschäftsKonto(int nummer){
		super();
		super.setNummer(nummer);
		GeschäftsKonto.anzahl++;
	}
	public static int gibAnzahlAus(){
		return GeschäftsKonto.anzahl;
	}
}
