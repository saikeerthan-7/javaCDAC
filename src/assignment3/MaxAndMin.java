package assignment3;

import java.util.*;

public class MaxAndMin {
	
	public static void maxarr(int num[]) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
//		
//		int high;
//		for(int i=0;i<num.length;i++) {
//			high=Math.max(max, num[i]);
//			max=high;
//		}
		
		for(int i=0;i<num.length;i++) {
			if(num[i]>max) {
				max=num[i];
			}
			if(num[i]<min) {
				min=num[i];
			}
		}
		System.out.println("Maximum value : " + max);
		System.out.println("Minimum value : " + min);
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array : ");
		int n = sc.nextInt();
		int num[]=new int[n];
		System.out.println("Enter the array elements : ");
		
		for(int i=0;i<n;i++) {
			num[i]=sc.nextInt();
		}
		
		maxarr(num);
		sc.close();
		
		
		
		
		
	
	}

}
