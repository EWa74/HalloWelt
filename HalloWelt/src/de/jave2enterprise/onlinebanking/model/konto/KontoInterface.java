package de.jave2enterprise.onlinebanking.model.konto;

public interface KontoInterface extends Gesch�ftsInterface, PrivatInterface {
	
	public final static int MAX_KONTO_ANZAHL = 100000;
	
	public abstract void setNummer(Integer nummer);
	
	public abstract Integer getNummer();
	

}
