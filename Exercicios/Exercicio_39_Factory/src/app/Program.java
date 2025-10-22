package app;

import java.util.Scanner;
import factory.LoanFactory;
import loan.Loan;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcaoMenuPrincipal = 0;

        System.out.println("Bem-vindo ao Sistema de Simulação de Empréstimos\n");

        do {
            System.out.println("Selecione o tipo de simulação que você deseja fazer:");
            System.out.println("(1) - Pessoal");
            System.out.println("(2) - Consignado");
            System.out.println("(3) - Sair");
            System.out.print("Opção: ");

            opcaoMenuPrincipal = sc.nextInt();
            sc.nextLine(); 

            Loan emprestimo = null;

            try {
                switch (opcaoMenuPrincipal) {
                    case 1:
                        emprestimo = LoanFactory.make(LoanFactory.PESSOAL);

                        break;
                    case 2:
                        emprestimo = LoanFactory.make(LoanFactory.CONSIGNADO);
                        break;
                    case 3:
                        System.out.println("Saindo do sistema...");
                        break;
                    default:
                        System.out.println("Opção inválida! Tente novamente.\n");
                        continue;
                }

                if (emprestimo != null) {
                    int opcaoAcoes = 0;
                    do {
                        System.out.println("Selecione o que você deseja fazer:");
                        System.out.println("(1) - Simular");
                        System.out.println("(2) - Exibir mensagem");
                        System.out.println("(3) - Voltar ao menu principal");

                        opcaoAcoes = sc.nextInt();

                        switch (opcaoAcoes) {
                            case 1:
                                emprestimo.simularEmprestimo(sc);
                                break;
                            case 2:
                                emprestimo.visualizarMensagem();
                                break;
                            case 3:
                                System.out.println("Voltando ao menu principal...\n");
                                break;
                            default:
                                System.out.println("Opção inválida! Tente novamente.\n");
                        }
                    } while (opcaoAcoes != 3);
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }

        } while (opcaoMenuPrincipal != 3);

        sc.close();
    }
}