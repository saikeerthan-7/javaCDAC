package assignment7;

import java.util.*;

public class BookManagement {
	Scanner s = new Scanner(System.in);
//	public ArrayList<Book> createBooks() {
//		Book b1 = new Book(101, "Ramayana", "Valmiki", 999);
//		Book b2 = new Book(102, "MahaBharatha", "Ganesha", 1899);
//		
//		ArrayList<Book> al = new ArrayList<>();
//		al.add(b1);
//		al.add(b2);
//		
//		return al;
//	}
//	
	public void displayBooks(ArrayList<Book> al) {
		for(Book obj : al) {
			obj.displayBook();
		}
	}
	
	public void searchBook(ArrayList<Book> al) {
		System.out.println("Enter the book ID : ");
		int n = s.nextInt();
		for(Book obj : al) {
			if(n == obj.bookId) {
				System.out.println("Book Found, Book Name : " + obj.title);
			}
		}
		
	}
	public void updateBook(ArrayList<Book> al) {
		System.out.println("Enter the book ID : ");
		int n = s.nextInt();
		System.out.println("Enter the updated title, author, price : ");
		String newTitle = s.next();
		String newAuthor = s.next();
		float newPrice = s.nextFloat();
		
		for(Book obj : al) {
			if(n == obj.bookId) {
				obj.title = newTitle;
				obj.author = newAuthor;
				obj.price = newPrice;
			}
		}
		displayBooks(al);

	}
	
	public void deleteBook(ArrayList<Book> al) {
		System.out.println("Enter the book ID : ");
		int n = s.nextInt();
		int pos = 0;
		for(Book obj : al) {
			if(obj.bookId == n) {
				pos = al.indexOf(obj);

			}
		}
		al.remove(pos);
		System.out.println("Book removed");
		displayBooks(al);

	}
	
}
