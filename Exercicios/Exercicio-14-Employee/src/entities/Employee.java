package entities;

public class Employee {
	
	public String Name;
	public double GrossSalary;
	public double Tax;
	
	public double NetSalary() {
		return GrossSalary - Tax;
	}
	
	public void IncreaseSalary(double porcentage) {
		
		GrossSalary += (GrossSalary * (porcentage/100));
		
		System.out.printf("Salario bruto atualizado: $ %.2f" , GrossSalary);
	}
	
	public String ToString() {
		return String.format("Employee - Nome: " + Name + ", $ %.2f", NetSalary());
	}
}
