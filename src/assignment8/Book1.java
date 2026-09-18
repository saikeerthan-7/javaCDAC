package assignment8;

import java.io.Serializable;

public class Book1 implements Serializable{
	int bookId;
	String title;
	String author;
	float price;
	
	public Book1(int bookId, String title, String author, float price) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public void displayBook() {
		System.out.println(bookId + "--->" +  title + "--->" + author + "--->" + price);
	}
	
}
