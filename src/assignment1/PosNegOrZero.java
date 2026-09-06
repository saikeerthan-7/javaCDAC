package assignment1;

import java.util.*;

public class PosNegOrZero {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value: ");
		int a=sc.nextInt();
		
		if(a>0) {
			System.out.println("positive");
		}
		else if(a<0) {
			System.out.println("negative");
		}
		else {
			System.out.println("zero");
		}
		
		sc.close();
	}

}
