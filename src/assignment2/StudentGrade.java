package assignment2;

public class StudentGrade {

	public static char calculateGrade(float marks) {
		char grade;
		if(marks>=90 && marks<=100) {
			grade='A';
		}
		else if(marks>=75 && marks<90) {
			grade='B';
		}
		else if(marks>=60 && marks<75) {
			grade='C';
		}
		else if(marks>=50 && marks<60) {
			grade='D';
		}
		else {
			grade='F';
		}
		return grade;
	}
	
	public static void main(String[] args) {
		System.out.println(calculateGrade(73));
	}

}
