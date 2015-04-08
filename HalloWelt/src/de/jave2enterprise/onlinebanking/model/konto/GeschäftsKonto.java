package de.jave2enterprise.onlinebanking.model.konto;


public class Gesch�ftsKonto extends Konto {
	public static int anzahl;
	
	public Gesch�ftsKonto(Integer nummer){
		super();
		super.setNummer(nummer);
		Gesch�ftsKonto.anzahl++;
	}
	public static Integer gibAnzahlAus(){
		return Gesch�ftsKonto.anzahl;
	}
}
