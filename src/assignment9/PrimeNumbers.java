package assignment9;

public class PrimeNumbers implements Runnable{
	@Override
	public void run() {
		generatePrimeNumbers();
	}
	
	public void generatePrimeNumbers() {
		for(int n = 2; n <= 50; n++) {
			boolean isPrime = true;
			for(int i = 2; i < n; i++) {
				if(n % i == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.println("Prime Number : " + n);
			}
		}
			
	}

}
