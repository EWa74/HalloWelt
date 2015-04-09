package de.java2enterprise.onlinebanking.model.konto;

public interface KontoInterface extends GeschäftsInterface, PrivatInterface {
	
	public final static int MAX_KONTO_ANZAHL = 100000;
	
	public abstract void setNummer(Integer nummer);
	
	public abstract Integer getNummer();
	

}
