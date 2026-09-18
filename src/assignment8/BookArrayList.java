package assignment8;

public class BookArrayList {
	int bookId;
	String title;
	String author;
	float price;
	public BookArrayList(int bookId, String title, String author, float price) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public void displayBook() {
		System.out.println(bookId + "--->" + title + "--->" + author + "--->" + price);
	}
	
}
