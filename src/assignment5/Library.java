package assignment5;

public class Library {
	String libraryName;
	String location;
	Book book;
	Library(String libraryName, String location, Book book) {
		this.libraryName = libraryName;
		this.location = location;
		this.book = book;
	}
	void libraryDisplay() {
		System.out.println("Library Name : " +libraryName);
		System.out.println("Location : " +location);
		book.displayBook();
	}
	
}
