package Question4;

import java.util.ArrayList;
import java.util.*;
public class ArrayListManipulation {
	Scanner sc = new Scanner(System.in);
	public void displayAllBooks(ArrayList<Book> al) {
		for(Book obj : al) {
			obj.displayBook();
		}
	}
	
	void searchBook(ArrayList<Book> al) {
		System.out.println("enter bookId ");
		int id=sc.nextInt();
		for(Book ele: al) {
			if(ele.bookId==id) {
				System.out.println("book found " + ele.title);
			}
		}
	}
	
	void updatebyPrice(ArrayList<Book> al) {
		System.out.println("enter bookId ");
		int id=sc.nextInt();
		System.out.println("enter the new price of book : ");
		float newPrice=sc.nextFloat();
		for(Book ele: al) {
			if(ele.bookId==id) {
				ele.price=newPrice;
				System.out.println("book price upadted to " + ele.price);
			}
		}
	}
	
	void deletebook(ArrayList<Book> al) {
		System.out.println("enter bookId ");
		int id=sc.nextInt();
		
		for(Book ele: al) {
			if(ele.bookId==id) {
				al.remove(ele);
				System.out.println("book is deleted " );
			}
		}
	}
	
	public void displayabove500(ArrayList<Book> al) {
		for(Book obj : al) {
			if(obj.price>500) {
				obj.displayBook();
			}
			
		}
	}
	
	float expensive=0;
	public void mostExpensive(ArrayList<Book> al) {
		for(Book obj : al) {
			if(obj.price>expensive) {
				expensive=obj.price;
			}	
		}
		for(Book obj : al) {
			if(obj.price==expensive) {
				System.out.println("the most expensive");
				obj.displayBook();
			}	
		}
		
		
	}
//	public void sortBook (ArrayList<Book> al) {
//		al.sort(Comparator.comparing(Book::getPrice).reversed());
//	}
}
