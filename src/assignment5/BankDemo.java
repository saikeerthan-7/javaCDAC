package assignment5;

public class BankDemo {

	public static void main(String[] args) {
		SavingsAccount s = new SavingsAccount(1234, "Keerthan", 25000, 7);
		s.calculateInterest();
		
		CurrentAccount c = new CurrentAccount(1234, "Keerthan", 25000);
		if(c.minimumBalance()) {
			System.out.println("Maintaining Balance");
		}
		else {
			System.out.println("Not maintaining balance");
		}
	}

}
