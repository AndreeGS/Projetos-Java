package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de números: ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for(int i = 0; i < vect.length; i++) {
			sc.nextLine();
			
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		
		System.out.print("Valores: ");
		
		double sum = 0.0;
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("\nValor na posição " + i + ": " + vect[i]);
			
			sum += vect[i];
		}
		
		System.out.printf("\nSoma: %.2f%n", sum);	
		
		double avg = sum / n;
		
		System.out.printf("Média: %.2f%n", avg);	

		sc.close();
	}
}
