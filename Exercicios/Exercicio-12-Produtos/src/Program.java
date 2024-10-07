import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String name;
		double price;
		int stock;
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		name = sc.next();
		
		System.out.print("Price: ");
		price = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		stock = sc.nextInt();
		
		Product prd = new Product();
		prd.Name = name;
		prd.Price = price;
		prd.Quantity = stock;
		
		System.out.print("Product data: ");
		System.out.print(prd.View());
		
		System.out.print("\nEnter the number of products to be added in stock: ");
		stock = sc.nextInt();
		
		prd.AddProducts(stock);
		
		System.out.print("\nEnter the number of products to be removed from stock: ");
		stock = sc.nextInt();
		
		prd.RemoveProducts(stock);
		
		sc.close();
	}

}
