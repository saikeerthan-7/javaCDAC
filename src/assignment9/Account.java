package assignment9;

public class Account {
	private int amount = 50000;
	
	public synchronized void upiPayment(int a) {
		if(amount >= a) {
			amount -= a;
			System.out.println(Thread.currentThread().getName() + " UPI Payment Debited " + a);
			System.out.println("Remaining Balance : " + amount);
		}
		else {
			System.out.println("Insufficient Balance for UPI Payment");
		}
	}
	
	public synchronized void atmWithdrawal(int b) {
		if(amount >= b) {
			amount -= b;
			System.out.println(Thread.currentThread().getName() + " ATM Withdrawal " + b);
			System.out.println("Remaining Balance : " + amount);
		}
		else {
			System.out.println("Insufficient Balance for ATM Withdrawal");
		}
	
	}

}
