package entities;

public class CurrencyConverter {
	
	public static final double IOF = 6.0/100.0;
	
	public static double convertDollarToReais(double dollarValue, double dollarToBuy) {	
		double total = dollarValue * dollarToBuy;
		return total + (total * IOF);
	}
}
