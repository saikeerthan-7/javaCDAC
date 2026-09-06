package assignment6;


public class SavingsAccount extends BankAccount{
	
	SavingsAccount(long accountNumber, String customerName, double balance) {
		super(accountNumber, customerName, balance);
		}

	@Override
	public void calculateWithdrawLimit() {
		System.out.println("Withdraw Limit : " + balance * (95f / 100));
	}
	

	public static void main(String[] args) {
		SavingsAccount s1 = new SavingsAccount(2304586, "Keerthan", 523000);
		s1.calculateWithdrawLimit();
		s1.displayAccountDetails();
	}

}
