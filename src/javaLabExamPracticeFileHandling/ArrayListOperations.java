package javaLabExamPracticeFileHandling;
import java.util.*;

public class ArrayListOperations {
	
	ArrayList<Student> al = new ArrayList<>();
	Scanner s = new Scanner(System.in);
	
	public void addStudent() {
		al.add(new Student(s.nextInt(), s.next(), s.next(), s.nextFloat(), s.nextInt()));
		
	}
	
	public void displayAllStudents() {
		for(Student st : al) {
			st.displayStudent();
		}
	}
	
	public void searchByStudentID() {
		System.out.println("Enter Student ID : ");
		int id = s.nextInt();
		for(Student st : al) {
			if(st.studentID == id) {
				st.displayStudent();
				return;
			}
		}
		System.out.println("Student Not Found");
	}
	
	public void updateStudentDetails() {
		System.out.println("Enter Student ID to update");
		int id = s.nextInt();
		for(Student st : al) {
			s.nextLine();
			System.out.println("Enter Name : ");
			String newName = s.nextLine(); 
			System.out.println("Enter Course : ");
			String newCourse = s.nextLine();
			System.out.println("Enter Marks : ");
			float newMarks = s.nextFloat();
			System.out.println("Enter Age : ");
			int newAge = s.nextInt();
			
			st.studentName = newName;
			st.course = newCourse;
			st.marks = newMarks;
			st.age = newAge;
			return;
		}
		System.out.println("Student ID Not Found");
	}
	
	public void deleteStudent() {
		System.out.println("Enter Student ID : ");
		int id = s.nextInt();
		
		Iterator<Student> i = al.iterator();
		
		while(i.hasNext()) {
			Student s1 = i.next();
			if(s1.studentID == id) {
				i.remove();
				return;
			}
		}
		System.out.println("Student ID not found");
	}
	
}
