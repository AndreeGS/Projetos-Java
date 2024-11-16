package entities;

public class User {

	private int Id;
	private String Name;
	private double Salary;
	
	public User(int id, String name, double salary) {
		Id = id;
		Name = name;
		Salary = salary;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}
	
	public void Aumento(double newIncreasePorcent) {
		Salary += (Salary * newIncreasePorcent)/100.0;
	}
	
	public String ToString() {
		return "Id: " + Id + ", Name: " + Name + ", Salary: R$" + String.format("%.2f" , Salary); 
	}
}
