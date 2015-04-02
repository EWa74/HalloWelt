package de.jave2enterprise.onlinebanking;
      
public class HalloWelt {

	public static void main(String[] args) {
		Kunde meinKunde = new GeschäftsKunde(123);
		
		
		System.out.println(meinKunde.getKonto().getNummer());

	}

}
