package assignment9;

public class EvenNumbers implements Runnable{
	
	@Override
	public void run() {
		generateEvenNumbers();
	}
	
	public void generateEvenNumbers() {
		for(int i = 2; i <= 20; i++) {
			if((i & 1) == 0) {
				System.out.println("Even Number : " + i);
			}
		}
	}
}
