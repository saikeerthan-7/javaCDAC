package assignment9;


public class AccountMain {

	public static void main(String[] args) {

        Account acc = new Account();

        Thread t1 = new Thread(() ->  acc.upiPayment(30000));

        Thread t2 = new Thread(() ->  acc.atmWithdrawal(25000));
        
        t1.start();
        t2.start();
        
	}

}
