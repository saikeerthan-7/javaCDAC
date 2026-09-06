package assignment4;

public class Student {
	int rollNo;
	String name;
	float marks;
	
	public static String calculateGrade(float marks) {
		if(marks >= 90) {
			return "Grade A";
		}
		else if(marks >= 75 && marks < 90) {
			return "Grade B";
		}
		else if(marks >= 60 && marks < 75) {
			return "Grade C";
		}
		else {
			return "Grade D";
		}
	}
	
	public void display() {
		System.out.println("Roll Number : " + rollNo);
		System.out.println("Name : " + name);
		System.out.println("Marks : " + marks + " ---> " + calculateGrade(marks));
	}
}
