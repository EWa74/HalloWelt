package de.jave2enterprise.onlinebanking;

public class Konto {
	
	Konto(){
			System.out.println("Konto wird erzeugt");
	}

	int nummer;

	int getNummer() {
		return nummer;
	}

	void setNummer(int nummer) {
		this.nummer = nummer;
	}

}
