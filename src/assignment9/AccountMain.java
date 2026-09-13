package assignment9;


public class AccountMain {

	public static void main(String[] args) {

		Account acc = new Account();

        Runnable r1 = () -> acc.upiPayment(30000);

        Runnable r2 = () -> acc.atmWithdrawal(25000);

        Thread t1 = new Thread(r1, "UPI Thread");

        Thread t2 = new Thread(r2, "ATM Thread");

        t1.start();
        t2.start();
        
	}

}
