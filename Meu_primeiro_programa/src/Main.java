import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu peso em quilogramas: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a sua altura em metros: ");
        double altura = scanner.nextDouble();

        double imc = calcularIMC(peso, altura);

        System.out.println("\nSeu Índice de Massa Corporal (IMC) é: ");
        System.out.printf("%.2f%n", imc);

        scanner.close();
    }

    
    private static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }
}