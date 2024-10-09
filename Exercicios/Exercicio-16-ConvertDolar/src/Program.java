import java.util.Scanner;
import entities.CurrencyConverter;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double dollarBuy = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.convertDollarToReais(dollarPrice, dollarBuy) );
		
	}

}
