package javaLabExamPracticeHashMap;
import java.util.*;

public class Employee {
	int employeeID;
	String employeeName;
	String department;
	double salary;
	float experience;
	
	public Employee(int employeeID, String employeeName, String department, double salary, float experience) {
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.department = department;
		this.salary = salary;
		this.experience = experience;
	}
	
	public void displayEmployeeDetails() {
		System.out.println("Employee ID : " + employeeID);
		System.out.println("Employee Name : " + employeeName);
		System.out.println("Department : " + department);
		System.out.println("Salary : " + salary);
		System.out.println("Experience : " + experience);
	}

}
