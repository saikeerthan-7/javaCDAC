package javaPractice;

//Student
//
//Create a Student class with id, name, and marks.
//Create a method to display student details.
//Create 3 student objects.

public class Student {
	
	int id;
	String name;
	float marks;
	
	void details() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(marks);
		
	}



	public static void main(String[] args) {
		Student s = new Student();
		s.id =14;
		s.name = "Keerthan";
		s.marks = 91;
		s.details();
		

	}

}
