package assignment8;
import java.io.*;
import java.util.*;
public class WriteBookObjArrayList {

	public static void main(String[] args) throws Exception{
		FileOutputStream fos = new FileOutputStream("book1.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		
		Book1 b1 = new Book1(101, "Ramayana", "Valmiki", 999);
		Book1 b2 = new Book1(102, "Mahabharta", "Ganesha", 1899);
		
		List<Book1> bookList = new ArrayList<>();
		bookList.add(b1);
		bookList.add(b2);
		
		for(Book1 b : bookList) {
			oos.writeObject(b);
		}
//		oos.writeObject(b1);
//		oos.writeObject(b2);
		
		System.out.println("Object written successfully");
		
		oos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream("book1.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Book1 b;
		ArrayList<Book1> al = new ArrayList<>();
		try {
			while ((b =(Book1)ois.readObject()) != null) {
				al.add(b);
			}
		}
		catch(EOFException e) {
			
		}
		for(Book1 obj : al) {
			obj.displayBook();
		}
		fis.close();
		ois.close();
	}

}
