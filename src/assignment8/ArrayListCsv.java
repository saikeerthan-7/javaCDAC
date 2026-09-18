package assignment8;
import java.util.*;
import java.io.*;

public class ArrayListCsv {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("bookObject.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		BufferedReader br = new BufferedReader(new FileReader("book_details.csv"));
		
		String str;
		while((str = br.readLine()) != null) {
			String[] arr = str.split(",");
			Book1 b = new Book1(Integer.parseInt(arr[0]), arr[1], arr[2], Float.parseFloat(arr[3]));
			oos.writeObject(b);
		}
		br.close();
		oos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream("bookObject.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Book1 b;
		ArrayList<Book1> al = new ArrayList<>();
		try {
			while((b = (Book1)ois.readObject()) != null) {
				al.add(b);
			}
		}
		catch(EOFException e) {
			
		}
		for(Book1 ele : al) {
			ele.displayBook();
		}
	}

}
