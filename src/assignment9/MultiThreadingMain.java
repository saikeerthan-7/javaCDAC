package assignment9;

public class MultiThreadingMain {

	public static void main(String[] args) {
		EvenNumbers e = new EvenNumbers();
		Thread t1 = new Thread(e, "T1");
		
		PrimeNumbers p = new PrimeNumbers();
		Thread t2 = new Thread(p, "T2");
		
		t1.start();
		t2.start();
	}

}
