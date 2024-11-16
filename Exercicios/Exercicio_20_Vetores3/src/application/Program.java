package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de números: ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		
		for(int i = 0; i < vect.length; i++) {
			sc.nextLine();
			
			vect[i] = sc.nextInt();	
		}
		
		for(int i = 0; i<vect.length; i++) {
			
			if(vect[i] < 0) {
				System.out.println("valores negativos: " + vect[i]);
			}
		}
		
				
		sc.close();
	}
}
