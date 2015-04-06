package de.jave2enterprise.onlinebanking.model.konto;

public class Konto implements KontoInterface{
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + nummer;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Konto)) {
			return false;
		}
		Konto other = (Konto) obj;
		if (nummer != other.nummer) {
			return false;
		}
		return true;
	}

	public Konto(){
			System.out.println("Konto wird erzeugt");
	}

	private int nummer;

	public int getNummer() {
		return nummer;
	}

	public void setNummer(int nummer) {
		this.nummer = nummer;
	}

	@Override
	public String toString() {
		return "Konto [nummer=" + nummer + "]";
	}

}
