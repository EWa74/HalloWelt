package de.java2enterprise.onlinebanking.model.konto;
/**
 * In dieser <b>Klasse</b> werden die Gesch�ftskonten gekapselt.
 * @author ewa
 *
 */

public class Gesch�ftsKonto extends Konto {
	/**
	 * Die Anzahl der Konten
	 */
	
	public static int anzahl;
	
	public Gesch�ftsKonto(Integer nummer){
		super();
		super.setNummer(nummer);
		Gesch�ftsKonto.anzahl++;
	}
	/**
	 * 
	 * @return anzahl
	 * 			die Anzahl der Konten
	 */
	public static Integer gibAnzahlAus(){
		return Gesch�ftsKonto.anzahl;
	}
}
