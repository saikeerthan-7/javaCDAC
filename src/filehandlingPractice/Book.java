package filehandlingPractice;

import java.io.Serializable;

public class Book  implements Serializable{
	int BookId;
	String title;
	String author;
	float price;
	public Book(int bookId, String title, String author, float price) {
		super();
		BookId = bookId;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	void display() {
		System.out.println(BookId + "---->" + title +"---->" + author  + "---->" + price);
	}
}
