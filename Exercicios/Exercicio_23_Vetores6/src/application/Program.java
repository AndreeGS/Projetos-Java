package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for(int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("Números pares: ");
		int qtdPares = 0;
		
		for(int i = 0; i < vect.length; i++) {
			
			if( vect[i]%2 == 0) {
				
				System.out.print(" " + vect[i]);
				qtdPares += 1;
			}
		}
		
		System.out.printf("\nQuantidade de pares = " + qtdPares);
		sc.close();
	}

}
