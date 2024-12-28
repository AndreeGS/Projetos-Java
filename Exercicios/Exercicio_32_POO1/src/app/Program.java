package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Product #" + i + "data: ");
			
			System.out.print("Commom, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			
			if(ch == 'u') {
				System.out.print("Manufacture date (dd/mm/yyyy): ");
				sc.nextLine();
				String dt = sc.nextLine();
				
	            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	            Date dtformat = sdf.parse(dt);	
	            
	            list.add(new UsedProduct(name, price, dtformat));
	        }
			
			else if(ch == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				
				list.add(new ImportedProduct(name, price, customsFee));
			}
			
			else {
				list.add(new Product(name, price));
			}
		}
		
		System.out.println("\nPRICE TAGS: ");

		for(Product pr : list) {
			System.out.println(pr.priceTag());
		}
		
		sc.close();
	}

}
