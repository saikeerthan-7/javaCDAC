package assignment8;

import java.io.*;

class ReadBookObject {
	public static void main(String[] args) throws Exception{
		FileInputStream fio = new FileInputStream("book.txt");
		ObjectInputStream ois = new ObjectInputStream(fio);
		
		Book b = (Book)ois.readObject();
		float finalPrice = b.price;

		if (b.price > 500) {
		    finalPrice = b.price - (b.price * 0.1f);
		}
		
		b.displayBook();
		System.out.println("Final Price : " + finalPrice);
		fio.close();
		ois.close();
	}
}