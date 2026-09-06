package oops;

public class StudentDemo {

	public static void main(String[] args) {
		Student s1 = new Student(); 
		Student s2 = new Student(); 
		Student s3 = new Student(); 
		
		s1.rollNo = 101;
		s1.name = "SaiKeerthan";
		s1.marks = 90;
		
		s2.rollNo = 102;
		s2.name = "Nitin";
		s2.marks = 90;
		
		s3.rollNo = 103;
		s3.name = "aaa";
		s3.marks = 65;
		
		s1.display();
		s2.display();
		s3.display();
		
		

	}

}
