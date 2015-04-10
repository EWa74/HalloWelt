package de.java2enterprise.onlinebanking.model.bank;
 
public final class Bank<E extends Object> implements BankInterface {

	private E[] e;

	public E[] getE() {
		return e;
	}

	public void setE(E[] e) {
		this.e = e;
	}
}
