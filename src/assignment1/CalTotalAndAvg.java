package assignment1;

import java.util.*;
public class CalTotalAndAvg {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the three values : ");
		
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		int sum = a + b + c;
		
		float avg = sum / 3;
		
		System.out.println("Sum of Three Numbers : "+sum);
		System.out.println("Average of three Numbers : "+avg);
		
		s.close();

	}

}
