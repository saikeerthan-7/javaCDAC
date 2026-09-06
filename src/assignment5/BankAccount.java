package assignment5;

public class BankAccount {
	int accNo;
	String customerName;
	double balance;
	static String bankName = "Axis";
	BankAccount(int accNo, String customerName, double balance) {
		this.accNo = accNo;
		this.customerName = customerName;
		this.balance = balance;
	}
	
}
class SavingsAccount extends BankAccount{
	float interestRate;
	SavingsAccount(int accNo, String customerName, double balance, float interestRate){
		super(accNo, customerName, balance);
		this.interestRate = interestRate;
	}
	void calculateInterest() {
		double interest = (interestRate/100) * balance; 
		System.out.println(interest);
	}
}
class CurrentAccount extends BankAccount{
//	double balance;
	CurrentAccount(int accNo, String customerName, double balance){
		super(accNo, customerName, balance);
	}

	boolean minimumBalance() {
		if(balance >= 5000) {
			return true;
		}
		else {
			return false;
		}
	}
}
