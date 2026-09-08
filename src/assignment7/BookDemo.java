package assignment7;

import java.util.*;

public class BookDemo {

	public static void main(String[] args) {
		BookManagement b = new BookManagement();
		Scanner s = new Scanner(System.in);
		Book b1 = new Book(101, "Ramayana", "Valmiki", 999);
		Book b2 = new Book(102, "MahaBharatha", "Ganesha", 1899);
		
		ArrayList<Book> al = new ArrayList<>();
		al.add(b1);
		al.add(b2);
		while(true) {
			System.out.println("Enter the choice");
			int n = s.nextInt();
			switch(n) {
			case 1 :
				b.displayBooks(al);
				break;
			case 2 :
				b.searchBook(al);
				break;
			case 3 :
				b.updateBook(al);
				break;
			case 4 :
				b.deleteBook(al);
				break;
			case 5 :
				System.exit(0);
			}
			
		}
		
	}
	

}
