package jdbc;
import java.sql.*;
import java.util.*;

public class PreparedStUpdateVal {

	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac", "root", "Saikeerthan@123");
		
		String q = "update student set course = ? where id = ?";
		
		PreparedStatement pst = con.prepareStatement(q);
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the id :");
		int id = s.nextInt();
		System.out.println("Enetr the course name :");
		String course = s.next();
		pst.setString(1, course);
		pst.setInt(2, id);
		
		int row = pst.executeUpdate();
		System.out.println(row + " record updated");
		con.close();
				
	}

}
