package assignment6;

public abstract class BankAccount {
	long accountNumber;
	String customerName;
	double balance;
	
	BankAccount(long accountNumber, String customerName, double balance) {
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.balance = balance;
	}
	
	public abstract void calculateWithdrawLimit();
	
	public double deposit(double amount) {
		balance += amount;
		System.out.println( amount + " Deposited Successfully");
		return balance;
	}
	public void displayAccountDetails() {
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Customer Name  : " + customerName);
	}
	
}
