package program;
import entities.Account;
import java.util.ArrayList;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		
		ArrayList<Account> data = new ArrayList<>();
		int select = 0;
				
		System.out.println("Welcome System of Bank");
		
		do {
			System.out.println("\nWhat do you want?");
			System.out.println("1 - Create");
			System.out.println("2 - Update");
			System.out.println("3 - Delete");
			System.out.println("4 - View");
			System.out.println("5 - Exit");

			select = sc.nextInt();
			sc.nextLine();
			
			if (select == 1) {
			    System.out.print("Code: ");
			    int codeAux = sc.nextInt();
			    sc.nextLine();
			    
			    System.out.print("Name: ");
			    String nameAux = sc.nextLine();  
			    
			    System.out.print("Do you want add balance? (y) (n): ");
			    char addBalance = sc.next().charAt(0);
			    sc.nextLine();
			    
			    if (addBalance == 'y') {
			        System.out.print("Balance: ");
			        double balanceAux = sc.nextDouble();
			        sc.nextLine();
			        
			        Account ac = new Account(codeAux, nameAux, balanceAux);  
			        
			        data.add(ac);        
			    }
			    
			    else if (addBalance == 'n') {
			        Account ac = new Account(codeAux, nameAux);
			        data.add(ac);  
			    }
			    
			    else {
			        System.out.println("Invalid!");
			    }        
			}

			
			else if (select == 2) {
			    System.out.print("Code of update: ");
			    int updateAux = sc.nextInt();
			    sc.nextLine();
			    
			    int local = getPosition(data, updateAux);
			    
			    if (local != -1) {
			        System.out.print("Code: ");
			        int codeAux = sc.nextInt();
			        sc.nextLine();
			        
			        System.out.print("Name: ");
			        String nameAux = sc.nextLine();  
			        
			        data.get(local).setCode(codeAux);
			        data.get(local).setName(nameAux);
			        
			        System.out.println("Account updated successfully.");
			        
			    } else {
			        System.out.println("Account not found.");
			    }
			}

			else if (select == 3) {
				System.out.print("Code of delete: ");
				int deleteAux = sc.nextInt();
				sc.nextLine();
				
				int local = getPosition(data, deleteAux);
				
				if (local != -1) {
					data.remove(local);
					System.out.println("Account deleted successfully.");
					
				} else {
					System.out.println("Account not found.");
				}
			}
			
			else if (select == 4) {
				System.out.println("What Accout do you want view?");
				int viewAux = sc.nextInt();
				sc.nextLine();
				
				int local = getPosition(data, viewAux);
				
				if(local != -1) {	
					System.out.print(data.get(local).ToString());
				}
				
				else {
					System.out.println("Account not found.");
				}

			}
			
			else if (select == 5) {
				System.out.println("Exiting...");
			}
			
			else {
				System.out.println("Invalid!");				
			}
			
		} while(select != 5);
		
		sc.close(); 
	}
	
	public static int getPosition(ArrayList<Account>Data, int codeSearch) {
		
		for(int i = 0; i < Data.size(); i++) {
						
			if (Data.get(i).getCodeAccount() == codeSearch) {
				return i;
			}				
		}
		return -1;
	}	
}





