import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo ao programa para calcular a velocidade média!");

        System.out.print("Digite o valor da distância percorrida: ");
        int distancia = sc.nextInt();

        System.out.print("Digite o valor do tempo em segundos percorrido: ");
        int tempo = sc.nextInt();

        double velocidade = (double) distancia / tempo;
        System.out.println("O valor da velocidade média é: " + velocidade);
    }
}
