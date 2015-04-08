package de.jave2enterprise.onlinebanking.model.konto;

public class Konto implements KontoInterface{
	private int nummer;
	
	public Konto() {
		System.out.println("Konto wird erzeugt");
	}

	public Integer getNummer() {
		return nummer;
	}

	public void setNummer(Integer nummer) {
		this.nummer = nummer;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + nummer;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Konto other = (Konto) obj;
		if (nummer != other.nummer)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Konto [nummer=" + nummer + "]";
	}
	

}
