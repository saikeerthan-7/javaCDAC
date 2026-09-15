package javaLabExamPracticeHashMap;
import java.util.*;

public class EmployeeMain {
	  public static void main(String[] args) {

	        HashMapOperations ho = new HashMapOperations();

	        Scanner s = new Scanner(System.in);

	        while(true) {

	            System.out.println("\n===== EMPLOYEE MANAGEMENT SYSTEM =====");
	            System.out.println("1. Add Employee");
	            System.out.println("2. Search Employee by ID");
	            System.out.println("3. Search Employee by Name");
	            System.out.println("4. Update Employee");
	            System.out.println("5. Delete Employee");
	            System.out.println("6. Sort by Salary Ascending");
	            System.out.println("7. Sort by Salary Descending");
	            System.out.println("8. Sort by Employee Name");
	            System.out.println("9. Exit");

	            System.out.println("Enter your choice : ");
	            int choice = s.nextInt();

	            switch(choice) {

	                case 1:
	                    ho.addNewEmployee();
	                    break;

	                case 2:
	                    ho.searchByEmployeeID();
	                    break;

	                case 3:
	                    ho.searchByEmployeeName();
	                    break;

	                case 4:
	                    ho.updateEmployeeDetails();
	                    break;

	                case 5:
	                    ho.deleteEmployeeID();
	                    break;

	                case 6:
	                    ho.sortBySalaryAscending();
	                    break;

	                case 7:
	                    ho.sortBySalaryDescending();
	                    break;

	                case 8:
	                    ho.sortByEmployeeName();
	                    break;

	                case 9:
	                    System.exit(0);

	                default:
	                    System.out.println("Invalid choice");
	            }
	        }
	    }
	

}
