package filehandlingPractice;
import java.io.*;
import java.util.ArrayList;
public class WriteAndReadObject {

	public static void main(String[] args) throws Exception{
		FileOutputStream fos = new FileOutputStream("details.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Book b1 = new Book(101, "ramayana", "valmiki", 500);
		Book b2 = new Book(102, ",mahabhartha", "ganesha", 999);
		
		oos.writeObject(b1);
		oos.writeObject(b2);
		
		System.out.println("objects added");
		oos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream("details.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Book b3;
		ArrayList<Book> al = new ArrayList<>();
		try {
			
		
			while((b3 = (Book)ois.readObject()) != null) {
				al.add(b3);
				
			}
		}
		catch(Exception e) {
			
		}
		for(Book ele : al) {
			ele.display();
		}
	}

}
