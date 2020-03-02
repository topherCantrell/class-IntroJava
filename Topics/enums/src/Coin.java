
public enum Coin {
	
	PENNY(1), NICKEL(5), DIME(10), QUARTER(25);
	
	private int cents;
	
	private Coin(int c) {
		cents = c;
	}
	
	public int getCents() {
		return cents;
	}
	
}

