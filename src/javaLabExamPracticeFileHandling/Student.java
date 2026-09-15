package javaLabExamPracticeFileHandling;

import java.io.Serializable;

public class Student implements Serializable{
	int studentID;
	String studentName;
	String course;
	float marks;
	int age;
	
	public Student(int studentID, String studentName, String course, float marks, int age) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.course = course;
		this.marks = marks;
		this.age = age;
	}
	
	public void displayStudent() {
		System.out.println("Student ID : " + studentID);
		System.out.println("Student Name : " + studentName);
		System.out.println("Course : " + course);
		System.out.println("Marks : " + marks);
		System.out.println("Age : " + age);
	}

}
