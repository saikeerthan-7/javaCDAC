package hashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashmapOperations {
	
	HashMap<Integer,Book> hm=new HashMap<>();
	Scanner sc=new Scanner (System.in);
	
	void addBook() {
		System.out.println("number of books you wnts add : ");
		int numoFbook=sc.nextInt();
		for(int i=0;i<numoFbook;i++) {
			System.out.println("enter the  book details of "+(i+1));
			System.out.println("enter book id:");
			int bookId=sc.nextInt();
			sc.nextLine();
			System.out.println("enter the book title: ");
			String title=sc.nextLine();
			System.out.println("enter the book author: ");
			String author=sc.nextLine();
			System.out.println("enter book price:");
			float price=sc.nextFloat();
			sc.nextLine();
			hm.put(bookId, new Book(bookId,title,author,price));
		}
		
	}
	
	
	void displayAllBooks() {
		for(Map.Entry<Integer, Book> hl:hm.entrySet()) {
			System.out.println(hl.getKey() + "---> ");
			hl.getValue().display();
		}
	}
	
	void searchBook() {
		System.out.println("Enter the Book ID : ");
		int n = sc.nextInt();
		if(hm.containsKey(n)) {
			hm.get(n).display();
		}
		
	}
	
	
	void updatebook() {
		System.out.println("Enter the Book ID : ");
		int n = sc.nextInt();
		sc.nextLine();
		if(hm.containsKey(n)) {
			System.out.println("enetr the title, author, price :");
			String newTitle = sc.nextLine();
			String newAuthor = sc.nextLine();
			float newPrice = sc.nextFloat();
			
			hm.put(n, new Book(n, newTitle, newAuthor, newPrice));
		}
	}
	
	void deletebook() {
		System.out.println("Enter the Book ID : ");
		int n = sc.nextInt();
		if(hm.containsKey(n)) {
			
			hm.remove(n);
		}
	}
}
