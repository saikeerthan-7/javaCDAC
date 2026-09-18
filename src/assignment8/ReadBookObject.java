package assignment8;

import java.io.*;

class ReadBookObject {
	public static void main(String[] args) throws Exception{
		FileInputStream fio = new FileInputStream("book.txt");
		ObjectInputStream ois = new ObjectInputStream(fio);
		
		Book b = (Book)ois.readObject();
<<<<<<< HEAD
		if(b.price > 500) {
			b.price = b.price - b.price * (10/100);
			System.out.println(b.price);
		}
		
		b.displayBook();
=======
		float finalPrice = b.price;

		if (b.price > 500) {
		    finalPrice = b.price - (b.price * 0.1f);
		}
		
		b.displayBook();
		System.out.println("Final Price : " + finalPrice);
>>>>>>> 0898fee2b00bebdc026391ec80ed1ea8a949b822
		fio.close();
		ois.close();
	}
}