package assignment1;

import java.util.*;

public class SimpleInterest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of principal, interest, time");
		int p = sc.nextInt();
		float r = sc.nextFloat();
		float t = sc.nextFloat();
		
		double si = (p * t * r) / 100;
		
		double amount  = si + p;
		
		System.out.println("Simple Interest : " + si);
		
		System.out.println("Total Amount : " + amount);
		sc.close();
	}

}
