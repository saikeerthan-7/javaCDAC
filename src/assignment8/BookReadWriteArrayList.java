package assignment8;
import java.io.*;
import java.util.*;

public class BookReadWriteArrayList {

	public static void main(String[] args) throws Exception{
		FileOutputStream fos = new FileOutputStream("bookObj.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		BufferedReader br = new BufferedReader(new FileReader("books.csv"));
		
		String obj;
		
		while((obj = br.readLine()) != null) {
			String[] arr = obj.split(",");
			
			BookArrayList b = new BookArrayList(Integer.parseInt(arr[0]), arr[1], arr[2], Float.parseFloat(arr[3]));
			oos.writeObject(b);
		}
		
		br.close();
		oos.close();
		fos.close();
		
		System.out.println("Object is written successfully");
		
		FileInputStream fis = new FileInputStream("bookObj.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		BookArrayList book;
		
		ArrayList<BookArrayList> al = new ArrayList<>();
		try {
		
			while((book = (BookArrayList) ois.readObject()) != null){
				al.add(book);
			}
		}
		catch(EOFException e) {
			
		}
		for(BookArrayList ele : al) {
			ele.displayBook();
		}
	}

}
