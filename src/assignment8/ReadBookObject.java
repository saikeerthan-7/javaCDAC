package assignment8;

import java.io.*;

class ReadBookObject {
	public static void main(String[] args) throws Exception{
		FileInputStream fio = new FileInputStream("book.txt");
		ObjectInputStream ois = new ObjectInputStream(fio);
		
		Book b = (Book)ois.readObject();
		if(b.price > 500) {
			b.price = b.price * (10/100) - b.price;
		}
		
		b.displayBook();
		fio.close();
		ois.close();
	}
}