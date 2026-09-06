package assignment1;

import java.util.*;

public class EvenOrOdd {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the integer: ");
		int a=sc.nextInt();
		
//		if(a%2==0) {
//			System.out.println("even");
//		}
//		else {
//			System.out.println("odd");
//		}
		
//		String result = a % 2 == 0 ? "Even" : "Odd"; 
//		System.out.println(result);
		
		
		if((a & 1) == 0) {
			System.out.println(a + "is Even Number");
		}
		else {
			System.out.println(a + " is Odd Number");
		} 
		sc.close();
	}

}
