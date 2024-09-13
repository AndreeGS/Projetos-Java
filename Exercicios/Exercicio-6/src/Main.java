import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int quantidade, valor, soma = 0;
		
		System.out.print("Informe a quantidade de números que você quer inserir: ");
		quantidade = sc.nextInt();
		
		for(int i = 1; i <= quantidade; i++) {
			System.out.print("Informe o valor da posição " + i + ": ");
			valor = sc.nextInt();
			
			soma += valor;
		}
		
		System.out.print("\nO valor da soma é igual: " + soma);
		
		sc.close();
	}
}
