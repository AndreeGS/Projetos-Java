import java.util.Scanner;

import entities.Triangle;


public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.print("Informe o valor do triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.print("Informe o valor do triangulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Área do triangulo X: %.4f%n", areaX);
		System.out.printf("Área do triangulo Y: %.4f%n", areaY);

		if(areaX > areaY) {
			System.out.printf("Maior triangulo é o X");
		} else {
			System.out.printf("Maior triangulo é o Y");
		}
		sc.close();
	}
}
