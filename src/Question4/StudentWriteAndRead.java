package Question4;
import java.io.*;
import java.util.*;

public class StudentWriteAndRead {

	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		FileOutputStream fos = new FileOutputStream("bookObject.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		BufferedReader bf = new BufferedReader(new FileReader("books.csv"));
		
		String objRead;
		while((objRead=bf.readLine())!=null) {
			
			String[] arr = objRead.split(",");
			Book b=new Book(Integer.parseInt(arr[0]),arr[1],arr[2],Float.parseFloat(arr[3]));
			oos.writeObject(b);
		}
		
		
		bf.close();
		oos.close();
		fos.close();
		
		
		
		FileInputStream fis = new FileInputStream("bookObject.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Book b;
		ArrayList<Book> al = new ArrayList<>();
		ArrayListManipulation a=new ArrayListManipulation();
		
		try {
		while((b= (Book) ois.readObject()) != null) {
			al.add(b);
		}
		}catch(Exception e) {
			
		}
   System.out.println("1. Display Books");
   
		
		int ch=sc.nextInt();
		switch(ch){
			case 1:
				a.displayAllBooks(al);
				break;
			
		}
		
		
		
		
	}
}
