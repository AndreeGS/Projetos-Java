package loan;

import java.util.Scanner;

public class Personal extends Loan {
	
	public Personal() {}

	@Override
    public void simularEmprestimo(Scanner sc) {
        System.out.print("\nInforme o valor desejado do empréstimo: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Valor inválido! Retornando ao menu.\n");
            sc.next();
            return;
        }

        double valor = sc.nextDouble();
        double taxaMensal = 0.035;
        double total = valor * (1 + taxaMensal);
        double valorParcela = total;

        System.out.printf("Simulação: Valor solicitado R$ %.2f → Total a pagar R$ %.2f\n\n", valor, total);
    }
    
    @Override
    public void visualizarMensagem() {
        System.out.println("\nMensagem: Obrigado por utilizar nosso simulador de empréstimos Pessoal!\n");
    }
}
