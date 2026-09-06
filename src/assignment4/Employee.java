package assignment4;

import java.util.*;

public class Employee {
	int empId;
	String empName;
	float salary;
	
	Scanner sc=new Scanner(System.in);
	
	void read() {
		
		empId=sc.nextInt();
		sc.nextLine();
		empName=sc.nextLine();
		salary=sc.nextFloat();
		}
	
	void display() {
		System.out.println("Employee Id: "+empId);
		System.out.println("Employee Name: "+empName);
		System.out.println("Employee Salary: "+salary);
		System.out.println("Employee Bonus: "+calculateBonus(salary));
	}
	
	public static float calculateBonus(float salary) {
		
		float bonus;
		
		if(salary>=50000) {
			bonus=salary*0.1f;
		}
		
		else {
			bonus=salary*0.05f;
		}
		return bonus;
	}
	
	
}
