package javaLabExamPracticeInherit;

public abstract class Employee {
	int id;
	String name;
	double salary;
	static String companyName = "Keerthan Tech";
	
	Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public abstract void calculateBonus();
	
	public void displayDetails() {
		System.out.println("Employee ID : " + id);
		System.out.println("Employee Name : " + name);
		System.out.println("Salary : " + salary);
		System.out.println("Company Name : " + companyName);
	}
	
	

}
