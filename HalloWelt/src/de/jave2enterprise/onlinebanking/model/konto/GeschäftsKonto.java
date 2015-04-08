package de.jave2enterprise.onlinebanking.model.konto;


public class GeschäftsKonto extends Konto {
	public static int anzahl;
	
	public GeschäftsKonto(Integer nummer){
		super();
		super.setNummer(nummer);
		GeschäftsKonto.anzahl++;
	}
	public static Integer gibAnzahlAus(){
		return GeschäftsKonto.anzahl;
	}
}
