package entities;

public class Account {

	private int codeAccount;
	private String holder;
	private double balance = 0.0;
	
	public Account (int codeAccount, String holder, double balance) {
		this.codeAccount = codeAccount;
		this.holder = holder;
		this.balance = balance;
	}
	
	public Account (int codeAccount, String holder) {
		this.codeAccount = codeAccount;
		this.holder = holder;
	}
	
	public int getCodeAccount() {
		return codeAccount;
	}
	
	public void setName(String newHolder) {
		this.holder = newHolder;
	}
	
	public void setCode(int newCode) {
		this.codeAccount = newCode;
	}
	
	
	public void deposit(double newDeposit) {
		this.balance += newDeposit;
	}
	
	public void saque(double withdraw) {
		this.balance -= (withdraw + 5.0);
	}
	
	public String ToString() {
		return "Account: " + codeAccount + "; Holder: " + holder + "; Balance: " + balance;
	}
}
