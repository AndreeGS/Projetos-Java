import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            System.out.println("Informe a quantidade de Minutos: ");
            Scanner sc = new Scanner(System.in);

            int minutos = sc.nextInt();

            double valorPlanoBasico = 50.00;
            int minutosPlanoBasico = 100;

            if (minutos > minutosPlanoBasico) {
                double valorExtra = (minutos - minutosPlanoBasico) * 2.00;
                valorPlanoBasico += valorExtra;

                System.out.printf("O valor será: R$ %.2f", valorPlanoBasico);
            } else {
                System.out.printf("O valor será: R$ %.2f", valorPlanoBasico);
            }
    }
}
