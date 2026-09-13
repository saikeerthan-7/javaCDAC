package assignment9;
import java.sql.*;
import java.util.*;

public class StudentOperations {
	Connection con;
	Scanner s = new Scanner(System.in);
	
	public StudentOperations() {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac","root", "Saikeerthan@123");
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}



	public void insertStudent() {
		try {
			String q = "insert into student values(?, ?, ?, ?)";
			PreparedStatement pst = con.prepareStatement(q);
			System.out.println("Enter the Student ID : ");
			int id = s.nextInt();
			s.nextLine();
			System.out.println("Enter Student Name : ");
			String name = s.nextLine();
			System.out.println("Enter the marks : ");
			int marks = s.nextInt();
			s.nextLine();
			System.out.println("Enter the course name : ");
			String course = s.nextLine();
			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setInt(3, marks);
			pst.setString(4, course);
			pst.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void displayAllStudents() {
		try {
			String q = "select * from student";
			PreparedStatement pst = con.prepareStatement(q);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int marks = rs.getInt(3);
				String course = rs.getString(4);
				System.out.println(id + " " + name + " " + marks + " "+course);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void searchByStudentID() {
		try {
			String q = "select * from student where id = ?";
			PreparedStatement pst = con.prepareStatement(q);
			System.out.println("Enter the student id : "); 
			int id = s.nextInt();
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				int sID = rs.getInt(1);
				String name = rs.getString(2);
				int marks = rs.getInt(3);
				String course = rs.getString(4);
				System.out.println(sID + " " + name + " " + marks + " "+course);
			}

		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void updateStudentDetails() {
		try {
			String q = "update student set marks = ? where id = ?";
			PreparedStatement pst = con.prepareStatement(q);
			System.out.println("Enter Student ID : ");
			int id = s.nextInt();
			System.out.println("Enter marks to update in table : ");
			int marks = s.nextInt();
			pst.setInt(1, marks);
			pst.setInt(2, id);
			pst.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void deleteStudent() {
		try {
			String q = "delete from student where id = ?";
			PreparedStatement pst = con.prepareStatement(q);
			System.out.println("Enter student id to delete : ");
			int id = s.nextInt();
			pst.setInt(1, id);
			pst.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
