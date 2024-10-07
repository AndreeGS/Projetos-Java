import java.util.Scanner;
import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		double height, width;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o valor da Altura: ");
		height = sc.nextDouble();
		
		System.out.print("Informe o valor da Largura: ");
		width = sc.nextDouble();

		Rectangle rec = new Rectangle();
		rec.Height = height;
		rec.Width = width;
		
		System.out.print(rec.ToString());
		
		sc.close();
	}

}
