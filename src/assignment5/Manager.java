package assignment5;
import java.util.*;
	public class Manager extends Employee{
		String department;
		int teamSize;
		
		static Scanner s = new Scanner(System.in);
		Manager(String department, int teamSize) {
			super(s.nextInt(), s.next(), s.nextFloat());
			this.department = department;
			this.teamSize = teamSize;
		}
		void display() {
			System.out.println("Employee ID : " + empId);
			System.out.println("Employee Name : " + empName);
			System.out.println("Company Name : " + companyName);
			System.out.println("Salary : " + salary);
			System.out.println("Department : " + department);
			System.out.println("Team Size : " + teamSize);
			System.out.println("Annual Salary : " + salary * 12);
		}
	

	public static void main(String[] args) {
		Manager m1 = new Manager(s.next(), s.nextInt());
		m1.display();

	}

}
