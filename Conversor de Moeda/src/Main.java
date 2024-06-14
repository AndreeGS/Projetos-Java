import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        double valorAtualDolar, valorConverter, valorConvertido;

        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo ao conversor de Moeda!");
        System.out.println("Infome o valor do Dolar atual: ");
        valorAtualDolar = sc.nextDouble();

        System.out.println("Qual valor você quer converter? ");
        valorConverter = sc.nextDouble();

        CurrencyConverter CC = new CurrencyConverter();

        valorConvertido = CC.calcular(valorAtualDolar, valorConverter);

        System.out.println("Valor em Reais: " + valorConvertido);

    }
}