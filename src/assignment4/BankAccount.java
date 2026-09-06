package assignment4;

public class BankAccount {

	int accountNo;
	String customerName;
	float balance;
	
	BankAccount(int accountNo,String customerName,float balance) {
		this.accountNo= accountNo;
		this.customerName=customerName;
		this.balance=balance;
		
	}
	
	void display() {
		System.out.println(accountNo);
		System.out.println(customerName);
		System.out.println(balance);
		System.out.println(calculateInterest(balance));
	}
	
	void checkBalance(float balance) {
		System.out.println(balance);
	}
	
	float calculateInterest(float balance) {
		if(balance>=100000) {
			return balance* (7.0f/100); 
		}
		else if(balance>=50000) {
			return balance* ((float)6/100);
		}
		else {
			return balance* 0.05f;
		}
	}
}
