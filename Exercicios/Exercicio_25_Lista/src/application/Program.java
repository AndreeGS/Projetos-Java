package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.User;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<User> list = new ArrayList<User>();
		
		
		System.out.print("Informe a quantidade de usuários: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i+1) + ":");
			
			System.out.print("Employee Id: ");
			int Id = sc.nextInt();
			
			while(hasId(list, Id)) {
				System.out.print("Id já está vinculado a um usuário, tente novamente!");
				Id = sc.nextInt();
			}
			
			System.out.print("Employee Name: ");
			String Name = sc.next();
			
			System.out.print("Employee Salary: ");
			double Salary = sc.nextDouble();
			
			list.add(new User(Id, Name, Salary));
		}
		
		System.out.print("Informe o Id para realizar um aumento: ");
		int Id = sc.nextInt();

		User user = list.stream().filter(x -> x.getId() == Id).findFirst().orElse(null);
		
		if( user == null) {
			System.out.print("Id não encontrado!");
			
		}
		else {
			System.out.print("Informe a porcentagem do aumento: ");
			double porcentagem = sc.nextDouble();
			
			user.Aumento(porcentagem);
			System.out.println("Aumento realizado com sucesso!");
		}

		System.out.println("Lista de usuários: ");
		for(User obj : list) {
			System.out.println(obj.ToString());
		}
		
		sc.close();
	}
	
	public static boolean hasId(List<User> list, int id) {
		User user = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return user != null;
	}
}
