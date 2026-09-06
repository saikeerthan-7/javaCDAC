package assignment3;

import java.util.*;
public class PrimeNumber {
	
	public static boolean checkPrime(int n) {
		if(n <= 1) {
			return false;
		}
		for(int i = 2; i <= Math.sqrt(n); i++) {
			
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = s.nextInt();
		if(checkPrime(n)) {
			System.out.println( n + " is Prime Number");
		}
		else {
			System.out.println( n + " is not a Prime Number");

		}
		s.close();
	}
	

}
