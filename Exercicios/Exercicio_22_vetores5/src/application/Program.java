package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		float[] altura = new float[n];
		
		
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			
			System.out.println("Dados da " + (i+1) + " primeira pessoa: ");
			
			System.out.println("Nome:   ");
			nome[i] = sc.next();
			
			System.out.println("Idade:   ");
			idade[i] = sc.nextInt();
			
			System.out.println("Altura:   ");
			altura[i] = sc.nextFloat();
			
		}
		
		float sum = (float) 0.0;
		float pessoasMenos16 = (float)0.0;
				
		for(int i = 0; i < n; i++) {
			sum += altura[i];
			
			if (idade[i] < 16) {
				pessoasMenos16 += 1;
			}
		}
		
		float avgAltura = sum / n;
		System.out.printf("Altura média: %.2f%n", avgAltura);
		
		float avgMenos16 = (pessoasMenos16 * 100) / n;
		System.out.printf("Pessoas com menos de 16  anos: %.2f%n", avgMenos16 , "%");

		for(int i = 0; i < n; i++) {		
			
			if (idade[i] < 16) {
				System.out.println(nome[i]);
			}
		}
		sc.close();
	}
}
