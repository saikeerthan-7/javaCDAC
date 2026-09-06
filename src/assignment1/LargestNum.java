package assignment1;

import java.util.*;

public class LargestNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of two nos");
		int p = sc.nextInt();
		int q = sc.nextInt();
		
		if(p > q) {
			System.out.println("P is Greater than Q");
		}
		else if(p < q){
			System.out.println("P is Less than Q");
		}
		else {
			System.out.println("P and Q are same");

		}
		sc.close();
	}

}
