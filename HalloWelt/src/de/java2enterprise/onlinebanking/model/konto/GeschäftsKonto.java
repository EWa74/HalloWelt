package de.java2enterprise.onlinebanking.model.konto;
/**
 * In dieser <b>Klasse</b> werden die Geschäftskonten gekapselt.
 * @author ewa
 *
 */

public class GeschäftsKonto extends Konto {
	/**
	 * Die Anzahl der Konten
	 */
	
	public static int anzahl;
	
	public GeschäftsKonto(Integer nummer){
		super();
		super.setNummer(nummer);
		GeschäftsKonto.anzahl++;
	}
	/**
	 * 
	 * @return anzahl
	 * 			die Anzahl der Konten
	 */
	public static Integer gibAnzahlAus(){
		return GeschäftsKonto.anzahl;
	}
}
