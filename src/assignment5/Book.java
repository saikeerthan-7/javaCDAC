package assignment5;

public class Book {
	int bookId;
	String title;
	String author;
	float price;
	Book(int bookId, String title, String author, float price) {
	
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	void displayBook() {
		System.out.println("Book Id : " + bookId);
		System.out.println("Title : " + title);
		System.out.println("Author : " + author);
		System.out.println("Price : " + price);
	}
}
