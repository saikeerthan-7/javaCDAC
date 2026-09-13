package assignment9;
import java.util.*;
public class StudentMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		StudentOperations so = new StudentOperations();
		
		while(true) {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Insert Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by Student ID");
            System.out.println("4. Update Student Marks");
            System.out.println("5. Delete Student");
            int choice;
            System.out.println("Enter your choice : ");
            choice = s.nextInt();
            switch(choice) {
            case 1 :
            	so.insertStudent();
            	break;
            case 2 :
            	so.displayAllStudents();
            	break;
            case 3 :
            	so.searchByStudentID();
            	break;
            case 4 :
            	so.updateStudentDetails();
            	break;
            case 5 :
            	so.deleteStudent();
            	break;
            default :
            	System.out.println("Enter the choice between 1 to 5");
            }
            

		}
		
	}
	

}
