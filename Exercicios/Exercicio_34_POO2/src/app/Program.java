package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Pessoa> list = new ArrayList<>();
		
		System.out.print("Informe o número de contribuintes: ");
		int n = sc.nextInt();
		
		for( int i = 1; i <= n; i++) {
			System.out.println("#" + i + " data: ");
			
			System.out.print("Pessoa física ou jurídica (f/j)? ");
			char ch = sc.next().charAt(0);
			
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Renda anual: ");
			Double rendaAnual = sc.nextDouble();
			
			if(ch == 'f') {		
				System.out.print("Qual o valor gasto com saúde? ");
				double gastoComSaude = sc.nextDouble();
				
				list.add(new PessoaFisica(name, rendaAnual, gastoComSaude));	
			}
			if(ch == 'j') {
				System.out.print("Quantidade de funcionários: ");
				int qtdFunc = sc.nextInt();
				
				list.add(new PessoaJuridica(name, rendaAnual, qtdFunc));
			}
			
			if (ch != 'f' && ch != 'j') {
			    System.out.println("Opção inválida! Informe 'f' para pessoa física ou 'j' para pessoa jurídica.");
			    i--; 
			    continue;
			}
		}
		
		System.out.println();
		System.out.println("Impostos Pagos: ");
		for(Pessoa pessoa : list) {
			System.out.println(pessoa.getName() + ": $" + String.format("%.2f", pessoa.impostoPago()));
		}
		
		System.out.print("Total de impostos: ");
		double total = 0.0;
		for(Pessoa pessoa : list) {
			total += pessoa.impostoPago();
		}
		
		System.out.println("$" + String.format("%.2f", total));
	}
}
