package de.jave2enterprise.onlinebanking.model.konto;

public interface KontoInterface extends GeschäftsInterface, PrivatInterface {
	
	public final static int MAX_KONTO_ANZAHL = 100000;
	
	public abstract void setNummer(int nummer);
	
	public abstract int getNummer();
	

}
