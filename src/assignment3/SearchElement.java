package assignment3;

import java.util.Scanner;

public class SearchElement {
	
	public static int searchElement(int nums[],int key) {
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int num[]= {2,3,4,5};
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]+" ");
		}
		System.out.println("Enter the element required:");
		int key=s.nextInt();
		
		int ans=searchElement(num, key);
		
		if(ans>=0)
		System.out.println("the element is present and its position:"+ans);
		
		else
			System.out.println("the element is not present");
		
		s.close();
		
		
	}

}
