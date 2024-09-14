import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int qtd;
		int []vect;
		
		System.out.print("Informe a quantidade de números que você quer inserir para verificar o maior:");
		
		qtd = sc.nextInt();
		vect = new int[qtd];
		
		for(int i = 0; i < qtd; i++) {
			
			System.out.print("\nInforme o número na posição " + i + ": ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("O maior número é: " + calcularMaior(vect));
		sc.close();
	}
	
	public static int calcularMaior(int[] numeros){
		int maior = 0;		
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] > maior) {
				maior = numeros[i];
			}			
		}
		return maior;
	}
}
