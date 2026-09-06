package assignment1;

import java.util.Scanner;

public class StudentResult {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the result: ");
		int result = sc.nextInt();
		
		if(result >= 40) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		sc.close();
	}

}
