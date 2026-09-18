package javaLabExamPracticeInherit;

public class Manager extends Employee{
	int teamSize;

	public Manager(int id, String name, double salary, int teamSize) {
		super(id, name, salary);
		this.teamSize = teamSize;
	}

	@Override
	public void calculateBonus() {
		System.out.println("Bonus : " + salary + salary * 0.1f);
	}
	
	public void managerDetails() {
		System.out.println("Manager Details : ");
		displayDetails();
		System.out.println("Team Size : " + teamSize);
		System.out.println("Manager is managing the team");
	}
}
