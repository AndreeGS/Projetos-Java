package app;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        VeiculoFactory factory = new VeiculoFactory();

		System.out.println("Informe o tipo do veiculo: \n");
		System.out.println("- Carro ");
		System.out.println("- Moto \n");

		String tipoVeiculo = sc.next();

        Veiculo veiculo = factory.make(tipoVeiculo);

        veiculo.ligar();
	}
}

class VeiculoFactory {
	public static final String MOTO = "Moto";
	public static final String CARRO = "Carro";

	public Veiculo make(String type) {
		switch(type) {
			case MOTO:
				return new Moto();
			case CARRO:
				return new Carro();
            default:
                throw new IllegalArgumentException("Tipo de veículo inválido: " + type);
		}
	}
}

interface Veiculo {
	public void ligar();
}

class Moto implements Veiculo{
	public Moto() {}
    @Override
	public void ligar() { System.out.println("\nLigando Moto"); }
}

class Carro implements Veiculo {
	public Carro() {}
    @Override
	public void ligar() { System.out.println("\nLigando Carro"); }
}