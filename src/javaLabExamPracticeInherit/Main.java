package javaLabExamPracticeInherit;

public class Main {

	public static void main(String[] args) {
		Developer d1 = new Developer(14, "Keerthan", 300000, "Java");
		d1.developerDetails();
		
		System.out.println();
		
		Manager m1 = new Manager(17, "Sai", 200000, 7);
		m1.managerDetails();

	}

}
