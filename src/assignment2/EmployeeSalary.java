package assignment2;

public class EmployeeSalary {

	public static int calculateSalary(int salary) {
		int finalsal;
		if(salary>=50000) {
			 finalsal=salary*120/100;
		}
		else {
			finalsal=salary*110/100;
		}
		return finalsal;
	}
	
	public static void main(String[] args) {
		int salary=48000;
		System.out.println(calculateSalary(salary));
	}

}
