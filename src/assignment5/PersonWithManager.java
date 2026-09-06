package assignment5;

import java.util.*;
class Person{
	static Scanner sc=new Scanner(System.in);
	
	String name;
	int age;
	static String organization="Google";
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

class Employee1 extends Person{
	int EmpId;
	float salary;
	
	Employee1(int EmpId,float salary){
		super(sc.next(),sc.nextInt());
		this.EmpId=EmpId;
		this.salary=salary;
	}	
}

public class PersonWithManager extends Employee1{
	String department;
	int teamsize;
	PersonWithManager(String department,int teamsize){
		super(sc.nextInt(),sc.nextFloat());
		this.department=department;
		this.teamsize=teamsize;
	}

	void display() {
		System.out.println("Manager Id:"+EmpId);
		System.out.println("Salary:"+salary);
		System.out.println("Department:"+department);
		System.out.println("Teamsize:"+teamsize);
		System.out.println("Organization:"+organization);
		System.out.println("Annual salary:"+salary*12);
	}
	
	public static void main(String[] args) {
		PersonWithManager m1= new PersonWithManager("AC",5);
		m1.display();
		
		PersonWithManager m2= new PersonWithManager("BDA",3);
		m2.display();
	}
	
	
}






