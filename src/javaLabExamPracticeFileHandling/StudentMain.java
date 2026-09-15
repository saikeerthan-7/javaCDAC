package javaLabExamPracticeFileHandling;

import java.util.*;

public class StudentMain {

    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	ReadWriteStudentObj rw = new ReadWriteStudentObj();
    	


        

        while(true) {

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Update Student Details");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.println("Enter your choice : ");
            int choice = s.nextInt();

            switch(choice) {

                case 1:
                    ao.addStudent();
                    break;

                case 2:
                    ao.displayAllStudents();
                    break;

                case 3:
                    ao.searchByStudentID();
                    break;

                case 4:
                    ao.updateStudentDetails();
                    break;

                case 5:
                    ao.deleteStudent();
                    break;

                case 6:
                	
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}