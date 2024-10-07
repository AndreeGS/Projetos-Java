import java.util.Scanner;

import entities.Employee;


public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		double grossSalary, tax, porcentage;
		
		System.out.print("Informe o nome do funcionário: ");
		name = sc.next();
		
		System.out.print("Informe o salário bruto do funcionário: ");
		grossSalary = sc.nextDouble();
		
		System.out.print("Informe a taxa de imposto: ");
		tax = sc.nextDouble();
		
		Employee employee = new Employee();
		
		employee.Name = name;
		employee.GrossSalary = grossSalary;
		employee.Tax = tax;
		
		System.out.print(employee.ToString());
		
		System.out.print("\nInforme a porcentagem do aumento do salário: ");
		porcentage = sc.nextDouble();
		
		employee.IncreaseSalary(porcentage);
		
		sc.close();
	}

}
