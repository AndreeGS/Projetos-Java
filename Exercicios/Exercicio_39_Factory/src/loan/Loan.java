package loan;

import java.util.Scanner;

public class Loan {
	public Loan() {}
	
    public void simularEmprestimo(Scanner sc) {
        System.out.print("\nInforme o valor desejado do empréstimo: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Valor inválido! Retornando ao menu.\n");
            sc.next();
            return;
        }

        double valor = sc.nextDouble();
        double taxa = 0.05;
        double total = valor + (valor * taxa);

        System.out.printf("Simulação: Valor solicitado R$ %.2f → Total a pagar R$ %.2f\n\n", valor, total);
    }

    public void visualizarMensagem() {
        System.out.println("\nMensagem: Obrigado por utilizar nosso simulador de empréstimos Consignado!\n");
    }

}
