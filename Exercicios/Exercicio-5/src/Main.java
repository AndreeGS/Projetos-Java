import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o primeiro valor: ");
		int x = sc.nextInt();
				
		int soma = 0;
		
		int i = 1;
		
		while (x != 0) {
			soma += x;
			
			System.out.print("Informe o valor "+ i + ": ");
			x = sc.nextInt();
			i++;
		}
		
		System.out.print("A soma dos valores digitados é: " + soma);
		sc.close();
	}
}
