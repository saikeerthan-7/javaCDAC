package jdbc;
import java.sql.*;
import java.util.*;

public class PreparedStInsertVal {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac", "root", "Saikeerthan@123");
		String q = "insert into student values(?, ?, ?, ?)";
		PreparedStatement pst = con.prepareStatement(q);
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter id :");
		int id = s.nextInt();
		s.nextLine();
		System.out.println("ENter name : ");
		String name = s.nextLine();
		System.out.println("Enter marks : ");
		int marks = s.nextInt();
		s.nextLine();
		System.out.println("Enter the course name : ");
		String course = s.nextLine();
		pst.setInt(1, id);
		pst.setString(2, name);
		pst.setInt(3, marks);
		pst.setString(4, course);
		
		int row = pst.executeUpdate();
		System.out.println(row + " record inserted");
				
		con.close();
		
	}

}
