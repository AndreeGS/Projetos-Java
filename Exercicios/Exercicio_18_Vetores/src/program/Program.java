package program;
import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o valor: ");
		int n = sc.nextInt();		
		double[] vect = new double[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Informe o valor: ");
			vect[i] = sc.nextDouble();
		}
		
		System.out.print("A media dos valores é: ");
		double sum = 0.0;
		
		for(int i = 0; i < n; i++ ) {
			sum += vect[i];
		}
		
		double avg = sum/n;
		
		System.out.printf("%.2f%n", avg);

		for(int i = 0; i < n; i++ ) {
			System.out.print("\nvalor na posição " + i + ": ");
			
			System.out.print(vect[i]);
		}
		
		
		sc.close();
	}

}
