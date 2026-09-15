package javaLabExamPracticeFileHandling;
import java.io.*;
import java.util.*;

public class ReadWriteStudentObj {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("student.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Student s1 = new Student(14, "Keerthan", "AC", 95, 22);
		Student s2 = new Student(17, "Sai", "AC", 95, 21);
		
		oos.writeObject(s1);
		oos.writeObject(s2);
		
		oos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream("student.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Student s;
		ArrayList<Student> al = new ArrayList<Student>();
		try {
			 while((s = (Student)ois.readObject()) != null){
				 al.add(s);
			 }
		}
		catch(EOFException e) {
			
		}
		 
		for(Student ele : al) {
			ele.displayStudent();
		}
	}

}
