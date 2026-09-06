package assignment6;

public class CurrentAccount extends BankAccount{

	public CurrentAccount(long accountNumber, String customerName, double balance) {
		super(accountNumber, customerName, balance);
	}
	@Override
	public void calculateWithdrawLimit() {
		double amount = 10000;
		if(balance < amount) {
			System.out.println("Withdraw Done");
			System.out.println("Balance : " + (balance - amount));
		}
	}
	
	public static void main(String[] args) {
		CurrentAccount c1 = new CurrentAccount(2365401, "Keerthan", 5000);
		c1.calculateWithdrawLimit();
		c1.displayAccountDetails();
		c1.deposit(7000);
	}
	
	

}
