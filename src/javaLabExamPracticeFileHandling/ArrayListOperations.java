package javaLabExamPracticeFileHandling;

import java.util.*;

public class ArrayListOperations {

    ArrayList<Student> al;

    Scanner s;

    public ArrayListOperations(ArrayList<Student> al, Scanner s) {
    	this.al = al;
        this.s = s;
        
    }
    
    public void addStudent() {
        System.out.println("Enter Student ID : ");
        int id = s.nextInt();
        for(Student st : al) {
            if(st.studentID == id) {
                System.out.println("Student ID already exists");
                return;
            }
        }
        System.out.println("Enter Student Name : ");
        String name = s.next();

        System.out.println("Enter Course : ");
        String course = s.next();

        System.out.println("Enter Marks : ");
        float marks = s.nextFloat();

        System.out.println("Enter Age : ");
        int age = s.nextInt();

        al.add(new Student(id, name, course, marks, age));

        System.out.println("Student added successfully");
    }

    public void displayAllStudents() {
        if(al.isEmpty()) {
            System.out.println("No students available");
            return;
        }
        for(Student st : al) {
            st.displayStudent();
        }
    }

    public void searchByStudentID() {
        System.out.println("Enter Student ID : ");
        int id = s.nextInt();
        for(Student st : al) {

            if(st.studentID == id) {
                st.displayStudent();
                return;
            }
        }
        System.out.println("Student Not Found");
    }

    public void updateStudentDetails() {
        System.out.println("Enter Student ID to update : ");
        int id = s.nextInt();
        for (Student st : al) {

            if (st.studentID == id) {

                System.out.println("Student ID found");

                System.out.println("Enter New Name : ");
                String newName = s.next();

                System.out.println("Enter New Course : ");
                String newCourse = s.next();

                System.out.println("Enter New Marks : ");
                float newMarks = s.nextFloat();

                System.out.println("Enter New Age : ");
                int newAge = s.nextInt();

                st.studentName = newName;
                st.course = newCourse;
                st.marks = newMarks;
                st.age = newAge;

                System.out.println("Student updated successfully");

                return;
            }
        }

        System.out.println("Student ID Not Found");
    }

    public void deleteStudent() {

        System.out.println("Enter Student ID : ");
        int id = s.nextInt();

        Iterator<Student> i = al.iterator();

        while (i.hasNext()) {

            Student st = i.next();

            if (st.studentID == id) {

                i.remove();

                System.out.println("Student deleted successfully");

                return;
            }
        }

        System.out.println("Student ID not found");
    }
}