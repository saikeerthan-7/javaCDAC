package assignment3;

import java.util.Scanner;

public class ReverseNum {

	public static int reverse(int num) {
		int rev=0;
		while(num>0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		return rev;
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter integer : ");
		int num=s.nextInt();
		System.out.println(reverse(num));
		s.close();
		
		
	}

}
