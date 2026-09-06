package assignment3;

import java.util.*;
public class SumOfDigits {
	
	public static int sumOfDig(int n) {
		int sum = 0;
		while(n > 0) {
			int rem = n % 10;
			sum += rem;
			n /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = s.nextInt();
		System.out.println("Sum of digits of " + n + " : "+sumOfDig(n));
		s.close();
	}

}
