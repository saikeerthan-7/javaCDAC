package assignment5;

public class LibraryBookDemo {
	public static void main(String[] args) {
		Book b = new Book(14, "Naa Saavu nenu sastha niku endhuku", "Keerthan", 999);
		Library l = new Library("CDAC", "Electronic City", b);
		l.libraryDisplay();
		
	}
}
