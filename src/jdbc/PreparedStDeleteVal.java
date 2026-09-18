package jdbc;
import  java.sql.*;
import java.util.*;

public class PreparedStDeleteVal {

	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac", "root", "Saikeerthan@123");
		String q = "delete from student where id = ?";
		PreparedStatement pst = con.prepareStatement(q);
		Scanner s = new Scanner(System.in);
		System.out.println("Enter id : ");
		int id = s.nextInt();
		pst.setInt(1, id);
		
		int row = pst.executeUpdate();
		System.out.println(row + " record deleted");
		
		con.close();
	}

}
