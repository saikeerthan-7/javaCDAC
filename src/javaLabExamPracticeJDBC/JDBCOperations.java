package javaLabExamPracticeJDBC;
import java.sql.*;
import java.util.*;

public class JDBCOperations {
	Connection con;
	Scanner s = new Scanner(System.in);
	public JDBCOperations() {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac", "root", "Saikeerthan@123");

		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void insertRecord() throws Exception{
		try {
			String q = "insert into student values(?, ?, ?, ?)";
			PreparedStatement pst = con.prepareStatement(q);
			System.out.println("Enter the student id : ");
			int id = s.nextInt();
			s.nextLine();
			System.out.println("Enter the student name : ");
			String name = s.nextLine();
			System.out.println("Enter the marks : ");
			float marks = s.nextFloat();
			s.nextLine();
			System.out.println("Enter the course : ");
			String course = s.nextLine();
			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setFloat(3, marks);
			pst.setString(4, course);
			pst.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws Exception{
		JDBCOperations j = new JDBCOperations();
		j.insertRecord();
	}
	
}
