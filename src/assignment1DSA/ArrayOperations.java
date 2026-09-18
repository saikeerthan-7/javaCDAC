package assignment1DSA;
import java.util.*;

public class ArrayOperations {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the Size of Array : ");
		int n = s.nextInt();
		int[] arr = new int[n];
		
		
		
		while(true) {
			
			System.out.println("Menu:\r\n"
					+ "1. Insert\r\n"
					+ "2. Delete\r\n"
					+ "3. Search\r\n"
					+ "4. Display\r\n"
					+ "5. Exit");
			
			System.out.println("Enter your choice:");
			int choice=s.nextInt();
			switch(choice) {
			case 1:
				insertElement(arr);
				break;
				
			case 2:
				deleteElement(arr);
				break;
			case 3:
				searchElement(arr);
				break;
				
			case 4:
				displayAllElements(arr);
				break;
				
			case 5:
				System.exit(0);
				
			}
		}
		
		
	}

	
	public static void insertElement(int[] arr) {
		try {
			for(int i = 0; i < arr.length; i++) {
				arr[i] = s.nextInt();
			}
		}catch(Exception e) {
			System.out.println("the array is already filled");
		}
		
	}
	
	public static void deleteElement(int[] arr) {
		try {
			System.out.println("At which index element need to be delete : ");
			int index = s.nextInt();
			
			arr[index]=0;
		}
		catch(Exception e) {
			System.out.println("Deleting when the array is empty.");
		}
		
	}
	
	public static void searchElement(int[] arr) {
		try {
			System.out.println("Enter the element to search : ");
			int key = s.nextInt();
			for(int i = 0; i < arr.length; i++) {
				if(key == arr[i]) {
					System.out.println("Element found at index : " + i);
					return;
				}
			}
		}
		catch(Exception e) {
			System.out.println("Invalid position.");
		}
	}
	
	public static void displayAllElements(int[] arr) {
//		for(int i=0;i<n;i++) {
//			System.out.println(arr[i]);
//		}
		System.out.println(Arrays.toString(arr));
	}
	
	
	
}
