package javaLabExamPracticeInherit;

public class Developer extends Employee{
	String programmingLanguage;
	
	public Developer(int id, String name, double salary, String programmingLanguage) {
		super(id, name, salary);
		this.programmingLanguage = programmingLanguage;
	}
	
	@Override
	public void calculateBonus() {
		System.out.println("Bonus : " + salary + (salary * 0.05f));
	}
	
	public void developerDetails() {
		System.out.println("Developer Details : ");
		 displayDetails();
		 System.out.println("Programming Language : " + programmingLanguage);
		 System.out.println("Developer is developing software");
	}
}
