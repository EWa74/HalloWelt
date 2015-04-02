      
public class HalloWelt {

	public static void main(String[] args) {
		Bank meineBank = new Bank();
		meineBank.kunde = new Kunde[1000];
		meineBank.kunde[0] = new Kunde();
		meineBank.kunde[0].konto = new Konto();
		Konto konto = meineBank.kunde[0].konto;
		konto.nummer=123;
		System.out.println(konto.nummer);
	}

}
