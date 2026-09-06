package assignment3;

import java.util.Scanner;

public class SimpleCalculator {
	
	public static void calculator(int a,int b,char c) {
		
		switch(c) {
			case '+':
				System.out.println(a + b);
				break;
			case '-':
				System.out.println(a - b);	
				break;
			case '*':
				System.out.println(a * b);	
				break;
			case '/':
				System.out.println(a / b);	
				break;
			case '%':
				System.out.println(a % b);
				break;
			
			default :
				System.out.println("Enter a valid operator");
		}
		
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		int a = s.nextInt();
		int b= s.nextInt();
		char c=s.next().charAt(0);
		calculator(a, b, c);
		s.close();
	}

}
