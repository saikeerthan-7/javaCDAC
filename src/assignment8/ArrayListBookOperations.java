package assignment8;

import java.util.*;

public class ArrayListBookOperations {
	
	public void displayAllBooks(ArrayList<Book1> be) {
		for(Book1 b:be) {
			b.displayBook();
		}
		
	}
	
	
	Scanner sc=new Scanner(System.in);
	
	public void searchBook(ArrayList<Book1> be) {
		int n=sc.nextInt();
		if(be.contains(n)) {
			System.out.println("The book is found:");
		}
		
		}
	
	
	public void updatePrice(ArrayList<Book1> be) {
		System.out.println("Enter the book id:");
		int n=sc.nextInt();
		
		System.out.println("Enter the amount:");
		int amount=sc.nextInt();
		float price;
		if(be.contains(n)) {
			price=amount;
		}
		
	}
	
	
	public void deleteBook(ArrayList<Book1> be) {
		System.out.println("Enter the book id: ");
		int n = sc.nextInt();
		
		if(be.contains(n)) {
			be.remove(n);
		}
	}
	
}
